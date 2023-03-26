package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll(",","");
        sentence = sentence.replaceAll("\\.","");
        List<String> words = Arrays.asList(sentence.split(" "));
        Map<String, Integer> map = new HashMap<>();

        for (int i=0; i<words.size(); i++){
            if (!words.get(i).equals("")){
                map.putIfAbsent(words.get(i), Collections.frequency(words, words.get(i)));
            }
        }

        return map;
    }
}
