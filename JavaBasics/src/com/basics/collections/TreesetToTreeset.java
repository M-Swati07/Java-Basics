package com.basics.collections;

import java.util.TreeSet;

//clone
public class TreesetToTreeset {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("Frank");
        treeSet.add("Welcome");
        treeSet.add("To");
        treeSet.add("India");

        System.out.println("Treeset : "+treeSet);

        System.out.println("Clone Treeset : "+treeSet.clone());
    }
}
