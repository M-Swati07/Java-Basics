package com.basics.collections.ArrayList;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println("Remove element at index 1 : "+arrayList.remove(1));
        System.out.println("Updated arraylist : "+arrayList);
    }
}
