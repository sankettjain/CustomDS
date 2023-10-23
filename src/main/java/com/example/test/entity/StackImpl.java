package com.example.test.entity;

import java.util.Stack;

public class StackImpl<T> implements DataStructure<T> {

    private Stack<T> incomingStack;

    public StackImpl() {
        this.incomingStack = new Stack<>();
    }

    @Override
    public void pushData(T data) {
        incomingStack.push(data);
    }

    @Override
    public T pop() {
        return incomingStack.pop();
    }

    @Override
    public void flush() {
        while (!incomingStack.isEmpty()) {
            System.out.println(incomingStack.pop());
        }
    }

    @Override
    public void print() {
        for (T data : incomingStack) {
            System.out.println("Value: " + data);
        }
    }

}
