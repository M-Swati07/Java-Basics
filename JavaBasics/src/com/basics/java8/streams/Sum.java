package com.basics.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().reduce(Integer::sum).get());
        System.out.println(numbers.stream().reduce((x, y) -> x +y).get());
    }
}
