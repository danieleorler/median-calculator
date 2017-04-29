package com.dalendev.median.app;

import java.util.HashMap;

/**
 * @author daniele.orler
 */
public class Histogram extends HashMap<Integer, Integer> {

    private Integer min;
    private Integer max;
    private Integer population;

    public Histogram() {
        max = 0;
        min = Integer.MAX_VALUE;
        population = 0;
    }

    public void addKey(Integer key) {
        if(this.containsKey(key)) {
            this.put(key, this.get(key) + 1);
        } else {
            this.put(key, 1);
        }

        min = key < min ? key : min;
        max = key > max ? key : max;
        population++;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    public int getPopulation() {
        return population;
    }
}
