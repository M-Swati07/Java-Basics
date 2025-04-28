package com.basics.collections.HashSet;

import java.util.*;

public class SortHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Happy");
        hashSet.add("Birthday");
        hashSet.add("Alison");

        System.out.println(hashSet);

        //Convert HashSet to List
        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        System.out.println(list);

        //Convert HashSet to TreeSet
        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
