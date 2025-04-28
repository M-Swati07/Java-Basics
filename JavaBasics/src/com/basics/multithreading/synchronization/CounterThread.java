package com.basics.multithreading.synchronization;

public class CounterThread extends Thread{

    private Counter counter;

    public CounterThread(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            counter.increment();
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
