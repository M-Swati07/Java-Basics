package com.basics.collections;

import java.util.*;

public class ArrayToList {

    public static void main(String[] args) {
        String[] arr = {"Sam", "Jack", "Tony", "Jerry"};
        List<String> list = Arrays.asList(arr);
        System.out.println("List of strings : "+list);

        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        HashSet<String> hashSet = new HashSet<>();
        for(String str : arr){
            hashSet.addAll(Arrays.asList(str));
        }

        System.out.println("Set of strings : "+hs);
        System.out.println("Set of strings : "+hashSet);

    }

}
