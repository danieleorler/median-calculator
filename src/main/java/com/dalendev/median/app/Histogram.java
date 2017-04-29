package com.dalendev.median.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author daniele.orler
 */
public class Histogram {

    private final Map<Integer, Integer> storage;
    private Integer size;

    public Histogram() {
        storage = new HashMap<Integer, Integer>();
        size = 0;
    }

    public void addKey(Integer key) {
        if(storage.containsKey(key)) {
            storage.put(key, storage.get(key) + 1);
        } else {
            storage.put(key, 1);
        }
        size++;
    }

    public Integer size() {
        return size;
    }

    public Iterator<Map.Entry<Integer, Integer>> iterator() {
        return storage.entrySet().iterator();
    }

}
