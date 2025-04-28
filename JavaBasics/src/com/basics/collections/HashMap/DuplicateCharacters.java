package com.basics.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] charArray = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : charArray){
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1)
                System.out.println(entry.getKey()+"=" +entry.getValue());
        }

    }
}
