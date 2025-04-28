package com.basics.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Stream<String> stream = list.stream().filter(
                x -> {
                    System.out.println("Filtering : "+x);   //this won't print because terminal ops is not invoked
                    return x.length() > 3;
                });

        System.out.println("Before terminal operation");

        List<String> res = stream.toList();
        System.out.println("After terminal operation");
        System.out.println(res);

    }
}
