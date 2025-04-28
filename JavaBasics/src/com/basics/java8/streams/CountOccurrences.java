package com.basics.java8.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrences {

    //Count occurrence of L in the string
    public static void main(String[] args) {

        String str = "Hello World";
        char[] ch = str.toCharArray();
       // Stream[Character] stream = Arrays.stream(ch); //this won't work since there is no Stream[Character]

        System.out.println(str.chars().filter(x -> x == 'l').count());

        //To fetch occurrence of all characters
        System.out.println(str.chars().mapToObj(x -> (char)x).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
