package com.basics.collections.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetValues {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(null);

        System.out.println(hashSet);
    }
}
