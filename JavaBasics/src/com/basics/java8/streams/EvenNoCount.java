package com.basics.java8.streams;

import java.util.Arrays;
import java.util.List;

public class EvenNoCount {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //Normal Flow
        int count = 0;
        for(int i : list){
            if(i % 2 == 0)
                count++;
        }
        System.out.println(count);

        //Stream
        System.out.println(list.stream().filter(x -> x%2 == 0).count());
    }
}
