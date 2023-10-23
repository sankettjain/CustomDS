package com.example.test.entity;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImpl<T> implements DataStructure<T> {

    private Queue<T> incomingQueue;

    public QueueImpl() {
        this.incomingQueue = new ArrayDeque<>();
    }

    @Override
    public void pushData(T data) {
        incomingQueue.add(data);
    }

    @Override
    public T pop() {
        return incomingQueue.poll();
    }

    @Override
    public void flush() {
        while (!incomingQueue.isEmpty()) {
            System.out.println(incomingQueue.poll());
        }
    }

    @Override
    public void print() {
        for (T data : incomingQueue) {
            System.out.println("Value: " + data);
        }
    }

}
