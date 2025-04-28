package com.basics.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringAndCollecting {
    public static void main(String[] args) {

        //Find the names whose length is > 3 : FILTERING AND COLLECTING
        List<String> nameList = Arrays.asList("Rahul", "Tia", "Sia", "Avani");
        System.out.println(nameList.stream().filter(x -> x.length() > 3).toList());
    }
}
