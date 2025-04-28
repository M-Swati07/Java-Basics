package com.basics.collections.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_ReadOnly {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map);

        Map<Integer, String> readOnlyMap = Collections.unmodifiableMap(map);
        readOnlyMap.put(3, "C");
        System.out.println(readOnlyMap);
    }
}
