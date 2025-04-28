package com.basics.multithreading;

public class DaemonThread extends Thread{

    //Daemon Threads are background threads for which the jvn doesn't wait, it will terminate if any daemon thread
    //is running in the background or not

    @Override
    public void run() {
        while (true){
            System.out.println("Thread t1 is running....");
        }
    }

    public static void main(String[] args) {

        //any thread created which is doing our work to execute the run function is called User Thread
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);     //this method must be invoked before the thread is started
        DaemonThread t2 = new DaemonThread();
        t2.start();     //since t2 is a user thread jvm will not terminate,
        t1.start();
        System.out.println("Main done");


    }
}
