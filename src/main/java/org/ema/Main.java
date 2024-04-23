package org.ema;

import org.ema.consumer.DataPointNormalizerApp;

public class Main {

  public static void main(String[] args) {
    DataPointNormalizerApp dataPointNormalizerApp = new DataPointNormalizerApp();
    dataPointNormalizerApp.getNormalizerApp().start();
  }
}