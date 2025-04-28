package com.basics.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceUsingGet {

    public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy";
        String[] splitString = str.split(" ");

        Map<String, Integer> hashMap = new HashMap<>();
        for(String word : splitString){
            Integer value = hashMap.get(word);  //get(key)
            System.out.println(value);
            if(value == null)
                hashMap.put(word, 1);
            else hashMap.put(word, value+1);

        }
        System.out.println(hashMap);
    }
}
