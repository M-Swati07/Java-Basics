package com.basics.multithreading.synchronization;

public class Counter {
    private int count = 0;

    //method synchronize
    public synchronized void increment(){
        count++;
    }

    //block synchronize
    /*
    public void increment(){
        synchronized(this){
            count++;
        }
    }
*/
    //getter
    public int getCount(){
        return count;
    }
}
