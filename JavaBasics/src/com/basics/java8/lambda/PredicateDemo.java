package com.basics.java8.lambda;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isStringStartingWithA = x -> x.toLowerCase().startsWith("a");
        System.out.println(isStringStartingWithA.test("Alison"));

        Predicate<String> isStringEndingWithT = x -> x.toLowerCase().endsWith("t");
        System.out.println(isStringEndingWithT.test("Trent"));

        Predicate<String> and = isStringStartingWithA.and(isStringEndingWithT);
        System.out.println(and.test("akshat"));
    }
}
