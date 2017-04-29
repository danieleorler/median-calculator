package com.dalendev.median.app;

import java.util.Iterator;
import java.util.Map;

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

        final Iterator<Map.Entry<Integer, Integer>> entryIterator = histogram.iterator();

        if(histogram.size() == 1) {
            return entryIterator.next().getKey();
        }

        final Integer size = histogram.size();
        final Integer medianPos = size/2 + 1;

        Integer currentPos = 0;
        Integer median = 0;

        while(currentPos < medianPos) {
            Map.Entry<Integer, Integer> entry = entryIterator.next();
            currentPos += entry.getValue();
            median = entry.getKey();
        }

        return median;
    }

}
