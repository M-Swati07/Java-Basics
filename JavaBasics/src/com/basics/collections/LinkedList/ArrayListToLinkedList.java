package com.basics.collections.LinkedList;

import java.util.*;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);

        System.out.println(linkedList);
    }
}
