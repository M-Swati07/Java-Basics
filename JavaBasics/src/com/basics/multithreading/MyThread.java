package com.basics.multithreading;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("RUNNING THREAD CLASS");
        try {
            Thread.sleep(2000);
            System.out.println("Thread-0 Name : " +Thread.currentThread().getName());
            System.out.println("Thread-0 Priority : " +Thread.currentThread().getPriority());
            System.out.println("Thread-0 Id : " +Thread.currentThread().getId());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
        System.out.println("Main Thread Name : " +Thread.currentThread().getName());
        System.out.println("Main Thread Priority : " +Thread.currentThread().getPriority());
        System.out.println("Main Thread Id : " +Thread.currentThread().getId());
    }
}
