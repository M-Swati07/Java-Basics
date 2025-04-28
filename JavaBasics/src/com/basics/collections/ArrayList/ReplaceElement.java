package com.basics.collections.ArrayList;

import java.util.ArrayList;

public class ReplaceElement {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println("Element to be removed at index 2 : "+arrayList.remove(2));
        arrayList.add(2, "E");
        System.out.println("New list after replacement : "+arrayList);
    }
}
