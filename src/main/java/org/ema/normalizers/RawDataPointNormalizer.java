package org.ema.normalizers;

import lombok.RequiredArgsConstructor;
import org.ema.dto.InputDataPoint;
import org.ema.dto.NormalizedDataPoint;

@RequiredArgsConstructor
public class RawDataPointNormalizer {
  private final JiraDataNormalizer jiraDataNormalizer;

  public NormalizedDataPoint normalize(InputDataPoint dataPoint) {
    switch (dataPoint.getPartnerType()) {
      case PARTNER_TYPE_JIRA:
        return jiraDataNormalizer.normalize(dataPoint);
      default:
        return NormalizedDataPoint.getDefaultInstance();
    }
  }
}
