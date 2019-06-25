package com.bhasker.dgstack.programms;

public class IncreamentCheck {

    private int number;

/*
In this case postfix ++ operator is used which first returns the value and then increments. Hence it's output will be 4.
 */
    public static void main(String args[]){

        int num = 4;
        System.out.println(num++);
//        System.out.println(++num);  this will print 5 if both statement used together output will be 4 , 6

        IncreamentCheck obj = new IncreamentCheck();

        System.out.println(obj.number);
    }
}
