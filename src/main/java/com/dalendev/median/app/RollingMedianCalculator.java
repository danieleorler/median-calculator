package com.dalendev.median.app;

/**
 * @author daniele.orler
 */
public class RollingMedianCalculator {

    private Histogram histogram;

    public RollingMedianCalculator(Histogram histogram) {
        this.histogram = histogram;
    }

    public void ingestSample(Integer sample) {
        histogram.addKey(sample);
    }

    public Integer calculateMedian() {
        Integer median = Math.findMedian(histogram);
        return median;
    }

}
