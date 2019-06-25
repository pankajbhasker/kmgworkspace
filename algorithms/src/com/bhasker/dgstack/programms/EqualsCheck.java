package com.bhasker.dgstack.programms;

/*
In Java, equals() method is used to compare the contents of two string objects and returns true if the two have same value while == operator compares the references of two string objects.
 */
public class EqualsCheck {

    public static void main(String args[])  throws CustomException{

        String str1 = new String("Hello World");
        String str2 = new String ("Hello World");
        String str3 = "Hello World";
        String str4 = "Hello World";

        System.out.println(" str1 equals str2 ≈ " + str1.equals(str2));
        System.out.println(" str1 equals str3 ≈ " + str1.equals(str3));
        System.out.println(" str1 == str3 ≈ " + str1 == str3);
        System.out.println(" str3 == str4 ≈ " + str3 == str4);

        if(str1.equals("Hello World")) {
            CustomException ex = new CustomException();
            ex.setExceptionCause("String match");
            ex.setMessage("Testing String equals");
            ex.setStatus("FAILURE");
            ex.setStatusCode(501);
               throw ex;
        }

    }
}
