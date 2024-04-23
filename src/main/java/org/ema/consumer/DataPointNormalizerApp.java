package org.ema.consumer;

import java.util.Properties;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.Produced;
import org.ema.dto.InputDataPoint;
import org.ema.dto.NormalizedDataPoint;
import org.ema.normalizers.JiraDataNormalizer;
import org.ema.normalizers.RawDataPointNormalizer;

public class DataPointNormalizerApp {
  private static final String INPUT_TOPIC_NAME = "raw_data_points";
  private static final String OUTPUT_TOPIC_NAME = "normalized_data_points";
  private static final String DATA_POINT_STREAM_NAME = "rawDataPointsStream";
  private static final String NORMALIZED_DATA_POINT_STREAM_NAME = "normalizedDataPointsStream";

  private final KafkaStreams normalizerApp;

  private final RawDataPointNormalizer rawDataPointNormalizer = new RawDataPointNormalizer(new JiraDataNormalizer());

  public DataPointNormalizerApp() {
    StreamsBuilder streamsBuilder = buildTopology();
    Topology topology = streamsBuilder.build();
    normalizerApp = new KafkaStreams(topology, new Properties());
  }

  private StreamsBuilder buildTopology() {
    StreamsBuilder streamsBuilder = new StreamsBuilder();
    streamsBuilder.stream(
        INPUT_TOPIC_NAME,
        Consumed.with(Serdes.String(), (Serde<InputDataPoint>) null)
          .withName(DATA_POINT_STREAM_NAME))
      .map(
        (k, v) -> new KeyValue<>(k, rawDataPointNormalizer.normalize(v)))
      .to(
        OUTPUT_TOPIC_NAME,
        Produced.with(Serdes.String(), (Serde<NormalizedDataPoint>) null)
          .withName(NORMALIZED_DATA_POINT_STREAM_NAME));
    return streamsBuilder;
  }

  public KafkaStreams getNormalizerApp() {
    return this.normalizerApp;
  }
}
