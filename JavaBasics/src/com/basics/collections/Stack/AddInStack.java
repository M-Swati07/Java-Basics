package com.basics.collections.Stack;

import java.util.Stack;

public class AddInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.add(2, 4);
        System.out.println(stack);
    }
}
