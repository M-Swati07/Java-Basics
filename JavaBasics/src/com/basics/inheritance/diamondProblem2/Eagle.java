package com.basics.inheritance.diamondProblem2;

public class Eagle implements Animal, Bird{
    public void eats(){
        System.out.println("Eagle is a carnivore");
    }

    public void fly(){
        System.out.println("Eagle can fly high");
    }
}
