package com.dalendev.median.app;

import java.util.Iterator;
import java.util.Map;

/**
 * @author daniele.orler
 */
public class Math {

    public static Integer findMedian(Histogram histogram) {

        final Integer size = histogram.size();
        final Integer medianPos = size/2 + 1;

        Iterator<Map.Entry<Integer, Integer>> entryIterator = histogram.iterator();

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
