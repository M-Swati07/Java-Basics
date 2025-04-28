package com.basics.java8.streams;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        //COLLECT
        System.out.println(list.stream().skip(1).collect(Collectors.toList()));
        System.out.println(list.stream().skip(1).toList());

        //FOREACH
        list.stream().forEach(x -> System.out.println(x));

        //REDUCE - Combines elements to produce single result
        System.out.println(list.stream().reduce((x,y)-> x+y).get());    //without get() output is - Optional[6]

        //anyMatch, noneMatch, allMatch
        System.out.println(list.stream().anyMatch(x -> x > 1));
        System.out.println(list.stream().noneMatch(x -> x < 0));
        System.out.println(list.stream().allMatch(x -> x > 0));


        //findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());


        //toArray
        Object[] array = Stream.of(1, 2, 3).toArray();
        System.out.println(array);

        //min, max
        System.out.println("min : "+Stream.of(1, 2, 3).min(Comparator.naturalOrder()).get());
        System.out.println("max : "+Stream.of(1, 2, 3).max(Comparator.naturalOrder()).get());
        System.out.println("max : "+Stream.of(1, 2, 3).max((a,b)-> a-b).get());

    }
}
