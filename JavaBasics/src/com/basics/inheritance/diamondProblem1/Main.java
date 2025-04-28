package com.basics.inheritance.diamondProblem1;

public class Main {
    public static void main(String[] args) {
        SmartHomeAssistant assistant = new SmartHomeAssistant();
        assistant.activate();
        assistant.turnOn();
        assistant.turnOff();
        assistant.deactivate();
    }
}
