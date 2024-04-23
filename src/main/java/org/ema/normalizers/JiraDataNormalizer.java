package org.ema.normalizers;

import java.util.Map;
import lombok.NoArgsConstructor;
import org.ema.dto.InputDataPoint;
import org.ema.dto.NormalizedDataPoint;
import org.ema.dto.Struct;
import org.ema.dto.TicketingEvent;
import org.ema.dto.TicketingEvent.Status;

@NoArgsConstructor
public class JiraDataNormalizer implements DataNormalizer {

  private enum Fields {
    TITLE,
    NAME,
    STATUS;
  }

  Map<Fields, String> fieldsMappings =
    Map.of(Fields.TITLE, "title", Fields.NAME, "ticket_name", Fields.STATUS, "ticket_status");

  @Override
  public NormalizedDataPoint normalize(InputDataPoint dataPoint) {
    NormalizedDataPoint.Builder normalizedBuilder = NormalizedDataPoint.newBuilder();

    normalizedBuilder
      .setId(dataPoint.getId())
      .setPartnerId(dataPoint.getPartnerId());

    normalizedBuilder.setTicketingEvent(convert(dataPoint.getData()));
    return normalizedBuilder.build();
  }

  private TicketingEvent convert(Struct inputData) {
    TicketingEvent.Builder ticketingEventBuilder = TicketingEvent.newBuilder();
    fieldsMappings.keySet()
      .forEach(k -> this.convert(k, inputData, ticketingEventBuilder));
    return ticketingEventBuilder.build();
  }

  void convert(Fields field, Struct inputData, TicketingEvent.Builder ticketingEventBuilder) {
    switch (field) {
      case STATUS:
        ticketingEventBuilder.setStatus(convertStatus(inputData.getFieldsMap()
          .get(fieldsMappings.get(Fields.STATUS)).getStringValue()));
      case NAME:
        ticketingEventBuilder.setName(fieldsMappings.get(Fields.NAME));
      case TITLE:
        ticketingEventBuilder.setTitle(fieldsMappings.get(Fields.TITLE));
    }
  }

  private Status convertStatus(String status) {
    return null;
  }
}
