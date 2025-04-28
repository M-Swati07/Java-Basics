package com.basics.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceUsingContains {
    public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy";
        String[] splitString = str.split(" ");

        Map<String, Integer> hashmap = new HashMap<>();
        for(String word : splitString){
            if(hashmap.containsKey(word))
                hashmap.put(word, hashmap.get(word)+1);
            else hashmap.put(word, 1);
        }
        System.out.println(hashmap);
    }
}
