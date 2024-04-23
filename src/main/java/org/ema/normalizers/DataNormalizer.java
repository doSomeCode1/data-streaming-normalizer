package org.ema.normalizers;

import org.ema.dto.InputDataPoint;
import org.ema.dto.NormalizedDataPoint;

public interface DataNormalizer {
  NormalizedDataPoint normalize(InputDataPoint dataPoint);
}
