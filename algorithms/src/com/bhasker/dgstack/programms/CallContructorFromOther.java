package com.bhasker.dgstack.programms;

/*
Constructor chaining
If a class has multiple constructors, it's possible to call one constructor from the body of another one using this().
and super();
It can be done in 2 ways –

Within same class: It can be done using this() keyword for constructors in the same class.
From base class: By using super() keyword to call a constructor from the base class.


 */
public class CallContructorFromOther  extends  CallConstructorFromParent{

    public CallContructorFromOther() {
        super();
        System.out.println("Default constructor calling");

    }
    public CallContructorFromOther(String name){
        this();
        System.out.println("Parameterized Constructor called " +name);
    }

    public  CallContructorFromOther(int a){
        this(5,10);
        System.out.println(a);
    }
    public CallContructorFromOther(int a, int b){
     System.out.println(a * b);
    }

    public static void main(String args[]){
        CallContructorFromOther obj =  new CallContructorFromOther("pankaj");
        CallContructorFromOther obj1 =  new CallContructorFromOther(5);
    }
}
