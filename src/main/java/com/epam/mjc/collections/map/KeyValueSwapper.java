package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public HashMap<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> swappedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            swappedMap.put(value, key);
        }
        return swappedMap;
    }
}