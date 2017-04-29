package com.dalendev.median.app;

import java.util.stream.IntStream;

/**
 * @author daniele.orler
 */
public class RollingMedianCalculator {

    private Histogram histogram;

    public RollingMedianCalculator(Histogram histogram) {
        this.histogram = histogram;
    }

    public Integer calculateMedian(IntStream stream) {
        stream.forEach(i -> histogram.addKey(i));
        Integer median = Math.findMedian(histogram);
        return median;
    }

}
