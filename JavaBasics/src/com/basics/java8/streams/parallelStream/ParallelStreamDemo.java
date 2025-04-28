package com.basics.java8.streams.parallelStream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();

        long startTime = System.currentTimeMillis();
        //List<Long> factorialList = list.stream().map(x ->factorial(x)).toList();
        List<Long> factorialList = list.stream().map(ParallelStreamDemo::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for sequential stream : "+(endTime-startTime));

        startTime = System.currentTimeMillis();
        factorialList = list.parallelStream().map(ParallelStreamDemo::factorial).toList();
        factorialList = list.parallelStream().map(ParallelStreamDemo::factorial).sequential().toList(); //parallel to sequential
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for parallel stream : "+(endTime-startTime));
    }
}
