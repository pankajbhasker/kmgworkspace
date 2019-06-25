package com.bhasker.dgstack.programms;

/*
Although String and StringBuffer both represent String objects, we can't compare them with each other using ==  and if we try to compare them, we get an compile time error.
 */
public class StringNStringBuffer {

    public static void main(String args[]){
        String str1 = new String("Life");
        StringBuffer str2 = new StringBuffer("Life");

        System.out.println(str1.equals(str2)); // return false
        // System.out.println(str1==str2); // Operator == cannot be applied to String, StringBuffer

        System.out.println(str1.contentEquals(str2)); // return true
    }
}
