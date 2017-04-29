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
        if(histogram.getPopulation() % 2 == 0) {
            System.out.println("WARNING: even number of samples. We only guarantee the result to be correct for an odd number of samples!");
        }

        Integer median = Math.findMedian(histogram);
        return median;
    }

}
