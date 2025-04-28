package com.basics.collections;

import java.util.Enumeration;
import java.util.Hashtable;

//display the contents of a HashTable using enumeration
public class HashtableUsingEnum {

    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Sam");
        hashtable.put(2, "Jack");
        hashtable.put(3, "Sunny");
        hashtable.put(4, "Mike");
        hashtable.put(5, "");

        System.out.println(hashtable);

        Enumeration en = hashtable.elements();
        System.out.println("contents : "+en);

        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
}
