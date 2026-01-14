package org.example;

public class Calculator {
    public int add (int a, int b){
        return a+b;
    }
    public int substract (int a, int b){
        return a-b;
    }
    public int devide ( int a, int b){
        if (b==0){
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return a/b;
    }
    public int multiplication (int a, int b){
        return  a*b;
    }
}
