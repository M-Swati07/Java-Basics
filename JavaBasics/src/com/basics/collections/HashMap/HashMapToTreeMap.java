package com.basics.collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapToTreeMap {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(1, "Jack");
        hashMap.put(2, "Hazel");
        hashMap.put(3, "Sarah");

        System.out.println(hashMap);

        treeMap = hashMap;
        System.out.println(treeMap);

        treeMap = new HashMap<>(hashMap);
        System.out.println(treeMap);

        treeMap.putAll(hashMap);
        System.out.println(treeMap);

        treeMap = hashMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldvalue, newvalue) -> newvalue, TreeMap::new));
        System.out.println(treeMap);

    }
}
