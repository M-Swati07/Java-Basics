package com.basics.collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CloneHashmap {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> map3 = new HashMap<>();
        Map<String, Integer> map4 = new HashMap<>();
        Map<String, Integer> map5 = new HashMap<>();

        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        System.out.println(map1);

//        int count = 1;
//        for(String s : map1.keySet()){
//            map2.put(s, count);
//            count++;
//        }

        //Iterate map elements
//        for(int i = 0; i < map1.size(); i++){
//            System.out.println(map1.entrySet().iterator().);
//        }


        //ENTRYSET
        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            map2.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Map2 : "+map2);

        //PUTALL
        map3.putAll(map1);
        System.out.println("Map3 : "+map3);

        //COPY CONSTRUCTOR
        map4 = new HashMap<>(map1);
        System.out.println("Map4 : "+map4);

        //ASSIGNMENT
        map5 = map1;
        System.out.println("Map5 : "+map5);

    }
}
