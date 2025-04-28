package com.basics.collections;

import java.util.*;

public class ShuffledArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Sarah");
        list.add("Chevy");
        list.add("Tom");

        System.out.println("List : "+list);
        Collections.shuffle(list);
        System.out.println("Shuffled List : "+list);

    }

}
