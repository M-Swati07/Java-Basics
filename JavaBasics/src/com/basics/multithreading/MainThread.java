package com.basics.multithreading;

public class MainThread extends Thread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.getAllStackTraces());
        System.out.println(Thread.activeCount());
    }

}
