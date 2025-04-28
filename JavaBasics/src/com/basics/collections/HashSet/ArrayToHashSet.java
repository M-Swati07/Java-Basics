package com.basics.collections.HashSet;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToHashSet {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};

        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);


        //convert array to stream
        //convert stream to set : Collectors.toSet
        //collect the formed set using collect() method
        //return the formed set
        Set<Integer> hashSet = Arrays.stream(arr).collect(Collectors.toSet());
        System.out.println(hashSet);
    }
}
