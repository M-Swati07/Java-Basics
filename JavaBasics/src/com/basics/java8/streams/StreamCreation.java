package com.basics.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        //From Collections
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> stream = numbers.stream();

        //From Arrays
        String[] arr = {"a", "b", "c"};
        Stream<String> streamOfArray = Arrays.stream(arr);

        //From Stream.of()
        Stream<Integer> streamOf = Stream.of(1, 2, 3);
        System.out.println("Stream.of : "+streamOf.toList());

        //Infinite Streams
        System.out.println(Stream.generate(() -> 1).limit(5).collect(Collectors.toList()));
        System.out.println(Stream.iterate(1, x-> x*2).limit(10).collect(Collectors.toList()));



    }
}
