package com.basics.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        //Collecting to a list
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list1.stream().filter(x -> x%2 == 0).collect(Collectors.toList()));

        //Collecting to a set - remove duplicate
        List<Integer> list2 = Arrays.asList(1, 2, 2, 4, 5);
        System.out.println(list2.stream().collect(Collectors.toSet()));

        //Collecting to a specific collection : can convert to any collection
        TreeSet<Integer> treeSet = list1.stream().collect(Collectors.toCollection(()-> new TreeSet<>()));
        System.out.println(treeSet);
    }
}
