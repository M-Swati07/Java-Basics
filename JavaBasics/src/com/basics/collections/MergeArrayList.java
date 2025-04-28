package com.basics.collections;

import java.util.ArrayList;
import java.util.List;

public class MergeArrayList {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        list1.add("Jack");
        list1.add("Sunny");
        list1.add("Sam");

        list2.add("Jim");
        list2.add("Tim");
        list2.add("Kim");

        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("Merged List : "+list3);
    }
}
