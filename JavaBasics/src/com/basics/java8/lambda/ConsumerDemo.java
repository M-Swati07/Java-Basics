package com.basics.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        //Only takes the input, doesn't return anything
        Consumer<Integer> consume = x -> System.out.println(x);
        consume.accept(10);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for(int i : x)
                System.out.println(i);
        };
        printList.accept(list);
    }
}
