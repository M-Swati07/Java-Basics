package com.basics.java8.lambda;

interface MathOperation{
    int operate(int a, int b);
}


public class LambdaDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            System.out.println("Hello World !");
        });
        t1.start();
        t1.join();

        MathOperation addition = ((int a, int b) -> {
            return a + b;
        });
        //can remove int from above and is understandable by operate method and also return statement
        // then {} should also be removed, as these are single line statements.

        MathOperation subtract = (a,b)-> a - b;
        int add = addition.operate(1, 2);
        int sub = subtract.operate(4, 5);
        System.out.println("Add : "+add+ " Sub : "+sub);
    }
}
