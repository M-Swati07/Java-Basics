package com.basics.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {

        //Intermediate operations transform a stream into another stream
        //they are lazy i.e they don't execute until terminal operation is invoked

        //FILTER
        List<String> friends = Arrays.asList("Harry", "George", "Michael", "Harry");
        Stream<String> filteredStream = friends.stream().filter(x -> x.startsWith("M")).limit(5);
        System.out.println(filteredStream.count());


        //MAP
        Stream<String> mapToUpperCase = friends.stream().map(x -> x.toUpperCase());
        Stream<String> mapToUpperCaseMethodRef = friends.stream().map(String::toUpperCase);
        System.out.println(mapToUpperCaseMethodRef.collect(Collectors.toList()));


        //SORTED
        Stream<String> sortedStream = friends.stream().sorted();
        System.out.println(sortedStream.toList());
        Stream<String> sortedStreamUsingComparator = friends.stream().sorted((x,y) -> x.length() - y.length());
        System.out.println(sortedStreamUsingComparator.toList());


        //DISTINCT
        List<String> distinct = friends.stream().filter(x -> x.startsWith("H")).distinct().toList();
        System.out.println(distinct);


        //LIMIT
        System.out.println(Stream.iterate(1, x -> x*2).limit(10).toList());


        //SKIP
        System.out.println(Stream.generate(() -> 8).skip(5).limit(10).toList());


        //PEEK : performs an action on each element as it is consumed
        System.out.println(Stream.iterate(1, x -> x+1).skip(10).limit(100).peek(System.out::println).toList());


        //FLATMAP :
        //handles streams of collections/lists/arrays where each element itself is collection
        //flatten nested structures so that they are processed in single sequence
        //transform and flatten elements at the same time
        List<List<String>> list = Arrays.asList(
                Arrays.asList("Apple", "Orange"),
                Arrays.asList("Tomato", "Onion"),
                Arrays.asList("Grapes", "Mango")
        );

        System.out.println(list.stream().flatMap(x -> x.stream()).toList());
        System.out.println(list.stream().flatMap(Collection::stream).map(String::toUpperCase).toList());

       List<String> list1 = Arrays.asList(
               "Hello World",
               "Java streams are powerful",
               "Using flatMap"
       );
        System.out.println(list1.stream().flatMap(x -> Arrays.stream(x.split(", "))).toList());


    }
}
