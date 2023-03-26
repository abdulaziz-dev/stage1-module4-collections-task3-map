package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        sourceMap.forEach((K, V) ->
            {
                if (map.containsKey(V)) {
                    if (K < map.get(V)) {
                        map.put(V, K);
                    }
                } else {
                    map.put(V, K);
                }
            });
        return map;
    }
}
