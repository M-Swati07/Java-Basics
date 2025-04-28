package com.basics.multithreading;

public class PriorityThread extends Thread{

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            String a = "";
            for(int k = 0; k < 1000000; k++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " Priority : "+Thread.currentThread().getPriority() + " Count : "+ i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        PriorityThread low = new PriorityThread("Low Priority Thread");
        PriorityThread medium = new PriorityThread("Medium Priority Thread");
        PriorityThread high = new PriorityThread("High Priority Thread");
        low.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        low.start();
        medium.start();
        high.start();
    }
}
