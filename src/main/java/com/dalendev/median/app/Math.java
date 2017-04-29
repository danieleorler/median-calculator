package com.dalendev.median.app;

/**
 * @author daniele.orler
 */
public class Math {

    static Integer findMedian(Histogram histogram) {

        if(histogram == null) {
            throw new IllegalStateException("Histogram cannot be null");
        }

        if(histogram.size() == 0) {
            return 0;
        }

        if(histogram.size() == 1) {
            return histogram.getMin();
        }

        final Integer population = histogram.getPopulation();
        final Integer medianPos = population/2 + 1;

        Integer currentPos = 0;
        Integer median = 0;
        Integer key = histogram.getMin();

        while(key <= histogram.getMax() && currentPos < medianPos) {
            if(histogram.containsKey(key)) {
                currentPos += histogram.get(key);
                median = key;
            }
            key++;
        }

        return median;
    }

}
