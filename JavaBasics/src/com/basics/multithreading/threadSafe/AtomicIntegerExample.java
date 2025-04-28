package com.basics.multithreading.threadSafe;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
        private AtomicInteger counter = new AtomicInteger(0);

        public void increment(){
            counter.incrementAndGet();
        }

        public int getCounter(){
            return counter.get();
        }

    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerExample example = new AtomicIntegerExample();
        Thread t1 = new Thread(()->{
            for(int i = 0; i < 1000; i++){
                example.increment();
            }
        });

        Thread t2 = new Thread(()->{
           for (int i = 0; i < 1000; i++){
               example.increment();
           }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(example.getCounter());
    }
}
