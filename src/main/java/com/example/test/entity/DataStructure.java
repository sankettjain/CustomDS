package com.example.test.entity;

public interface DataStructure<T> {


    void pushData(T data);

    Object pop();

    void flush();

    void print();


}
