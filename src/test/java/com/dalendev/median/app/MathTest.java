package com.dalendev.median.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniele.orler
 */
public class MathTest {

    @Test
    public void should_find_median_normal_histogram() {
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
    public void should_find_median_one_key_histogram() {
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
    public void should_find_median_empty_histogram() {
        Histogram histogram = new Histogram();

        Integer median = Math.findMedian(histogram);
        assertEquals(new Integer(0), median);
    }

    @Test(expected = IllegalStateException.class)
    public void should_throw_exception_null_histogram() {
        Math.findMedian(null);
    }

    @Test
    public void should_find_median_unordered_histogram() {
        Histogram histogram = new Histogram();
        histogram.addKey(7);
        histogram.addKey(200);
        histogram.addKey(2000);
        histogram.addKey(5);
        histogram.addKey(6);

        Integer median = Math.findMedian(histogram);
        assertEquals(new Integer(7), median);
    }

    @Test
    public void should_find_median_histogram_with_holes() {
        Histogram histogram = new Histogram();
        histogram.addKey(7);
        histogram.addKey(200);
        histogram.addKey(2000);
        histogram.addKey(1);
        histogram.addKey(5);

        Integer median = Math.findMedian(histogram);
        assertEquals(new Integer(7), median);
    }

}