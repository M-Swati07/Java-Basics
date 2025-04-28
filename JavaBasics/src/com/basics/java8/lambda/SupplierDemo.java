package com.basics.java8.lambda;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        //no input only output
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
    }
}
