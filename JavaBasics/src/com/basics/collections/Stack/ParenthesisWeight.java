package com.basics.collections.Stack;

import java.util.Stack;

public class ParenthesisWeight {
    public static void main(String[] args) {
        String s = "(()(()))";
        Stack<Integer> stack = new Stack<>();
        int weight = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                int push = stack.push(weight);
                System.out.println("Push : "+push); // Store previous weight
                weight = 0; // Reset for new nested level
            } else if (ch == ')') {
                int prevWeight = stack.pop(); // Retrieve previous weight
                System.out.println("Prev Weight : "+prevWeight);
                weight = prevWeight + Math.max(1, weight * 2); // Nested increases weight
                System.out.println("Weight : "+weight);
            }
        }
        System.out.println("Total weight : "+weight);
    }
}
