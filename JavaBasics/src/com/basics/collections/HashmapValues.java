package com.basics.collections;

import java.util.HashMap;

public class HashmapValues {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        hashMap.put(4, "E");
        hashMap.put(null, " ");

        System.out.println("Hashmap values : "+hashMap.values());
        System.out.println(hashMap.clone());
        System.out.println(hashMap.containsKey(5));
        System.out.println(hashMap.entrySet());
    }
}
