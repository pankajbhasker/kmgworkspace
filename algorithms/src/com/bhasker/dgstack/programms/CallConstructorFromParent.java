package com.bhasker.dgstack.programms;

public class CallConstructorFromParent {

    public CallConstructorFromParent() {
        System.out.println("Parent Default constructor called ");
    }

    public  CallConstructorFromParent(int a){
        this(5,10);
        System.out.println(a);
    }
    public CallConstructorFromParent(int a, int b){
        System.out.println(a * b);
    }

    public static void main(String args[]){
        CallConstructorFromParent obj =  new CallConstructorFromParent(7);

    }
}
