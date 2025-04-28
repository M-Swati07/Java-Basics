package com.basics.inheritance.diamondProblem1;

public class SmartHomeAssistant implements AlarmSystem, SmartLighting{

    @Override
    public void activate() {
        System.out.println("Activate Alarm");
    }

    @Override
    public void deactivate() {
        System.out.println("Deactivate Alarm");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the lights");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the lights");
    }

}

