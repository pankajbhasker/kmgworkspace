package com.bhasker.dgstack.inheritenceCheck;

public class Child extends Parent {

    public void displayMsg() {
        super.displayMsg();
        System.out.println("displaying Child");
//      super.displayMsg();
    }

    public static void main(String args[]) {
        Parent child = new Child();
        child.displayMsg();

    }
}
