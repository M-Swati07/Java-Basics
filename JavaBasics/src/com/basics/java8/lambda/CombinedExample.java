package com.basics.java8.lambda;

import java.util.function.*;

public class CombinedExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x%5 == 0;
        Function<Integer, Integer> function = x -> x/2;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        //BiPredicate, BiFunction, BiConsumer

        BiPredicate<Integer, Integer> biPredicate = (x,y) -> (x+y)%2 == 0;
        System.out.println(biPredicate.test(4, 4));

        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> (x+y)/2;
        System.out.println(biFunction.apply(10, 4));

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x+" "+y);
        biConsumer.accept(1, 2);

        //Function and BiFunction -> replaced with UnaryOperator and BinaryOperator they both extend Function and BiFunction respectively
        UnaryOperator<Integer> unary = x -> x+2;
        System.out.println(unary.apply(10));
        BinaryOperator<Integer> binary = (x,y) -> (x+y)+2;
        System.out.println(binary.apply(10, 20));
    }
}
