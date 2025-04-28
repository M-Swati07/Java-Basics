package com.basics.java8.lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> doubleIt = x -> x * 2;
        System.out.println(doubleIt.apply(10));

        Function<Integer, Integer> tripleIt = x -> x * 3;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.andThen(doubleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));
        System.out.println(Function.identity().apply(10));
    }
}
