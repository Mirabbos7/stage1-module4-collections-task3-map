package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] lowerString = sentence.toLowerCase().split(" ");
        Map<String, Integer> resMap = new HashMap<>();
        for (String element : lowerString){
            resMap.getOrDefault(element, 0);
        }
        return resMap;
    }
}