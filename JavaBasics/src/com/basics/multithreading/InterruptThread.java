package com.basics.multithreading;

public class InterruptThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running after sleep");
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted : "+e);
        }
    }

    public static void main(String[] args) {
        InterruptThread t1 = new InterruptThread();
        t1.start();
        t1.interrupt();
    }
}
