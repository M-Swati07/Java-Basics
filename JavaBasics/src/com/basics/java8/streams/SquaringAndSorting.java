package com.basics.java8.streams;

import java.util.Arrays;
import java.util.List;

public class SquaringAndSorting {
    public static void main(String[] args) {
        
        //SQUARING AND SORTING
        List<Integer> nameList = Arrays.asList(10, 8, 7, 1, 2, 3, 4, 5);
        System.out.println(nameList.stream().map(x -> x*x).sorted().toList());
    }
}
