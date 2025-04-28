package com.basics.collections.ArrayList;

import java.util.ArrayList;

public class Compare2ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);

        arrayList2.add(4);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(1);

        if(arrayList1.equals(arrayList2))
            System.out.println("Arraylist1 is equal to ArrayList2");
        else System.out.println("Arraylists are not equal");
    }
}
