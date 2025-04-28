package com.basics.java8.streams.parallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CumulativeSum {

    public static void main(String[] args) {

        //[1, 2, 3, 4, 5] -> expected result : [1, 3, 6, 10, 15]
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = 0;
//        List<Integer> cumulativeSum = list.parallelStream().map(x -> {
//                    int i = x + sum;
//                    sum = i;
//                    return i;
//                }
//        );        //can't change sum to final which will prevent data manipulation
//
        //To make thread safe using AtomicInteger
        AtomicInteger sum = new AtomicInteger();
        List<Integer> cumulativeSum = list.parallelStream().map(sum::addAndGet).toList();
        System.out.println("Cumulative Sum : "+cumulativeSum);

    }
}
