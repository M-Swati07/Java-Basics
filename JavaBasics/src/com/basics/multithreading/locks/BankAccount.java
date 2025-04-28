package com.basics.multithreading.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    /*
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+"Attempting to withdraw amount : "+amount);
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName()+"Proceeding with withdrawal");
            try{
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+"Completed Withdrawal");
            System.out.println(Thread.currentThread().getName()+"Balance after withdrawal : "+balance);
        }else {
            System.out.println(Thread.currentThread().getName()+"Insufficient Balance");
        }
    }
    */

    public final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+"Attempting to withdraw amount : "+amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try{
                        System.out.println(Thread.currentThread().getName()+"Proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName()+"Completed Withdrawal, Remaining Balance: "+balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName()+"Insufficient Balance");
                }
            }else {
                System.out.println(Thread.currentThread().getName()+"Couldn't acquire the lock, please try after sometime");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt(); //manually restored the state of the thread : good practice to write
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
