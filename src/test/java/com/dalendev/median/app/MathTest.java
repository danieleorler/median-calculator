package com.dalendev.median.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniele.orler
 */
public class MathTest {

    @Test
    public void should_find_median_normal_histogram() throws Exception {
        Histogram histogram = new Histogram();
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(6);
        histogram.addKey(6);
        histogram.addKey(6);
        histogram.addKey(7);
        histogram.addKey(7);

        Integer median = Math.findMedian(histogram);
        assertEquals(new Integer(6), median);
    }

    @Test
    public void should_find_median_one_key_histogram() throws Exception {
        Histogram histogram = new Histogram();
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(5);
        histogram.addKey(5);

        Integer median = Math.findMedian(histogram);
        assertEquals(new Integer(5), median);
    }

    @Test
    public void should_find_median_empty_histogram() throws Exception {
        Histogram histogram = new Histogram();

        Integer median = Math.findMedian(histogram);
        assertEquals(new Integer(0), median);
    }

}