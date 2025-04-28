package com.basics.collections.ArrayList;

import java.util.*;

public class ArrayList_ReadOnly {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Lily");
        list.add("Robin");
        list.add("Ted");

        System.out.println(list);

        List<String> readOnlyList = Collections.unmodifiableList(list);

        readOnlyList.add("Marshall");
        System.out.println(list);

    }
}
