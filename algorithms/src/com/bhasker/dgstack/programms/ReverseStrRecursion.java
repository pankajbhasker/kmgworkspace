package com.bhasker.dgstack.programms;

public class ReverseStrRecursion {

    public static void main(String args[]) {
        String str = "Pankaj";
        ReverseStrRecursion obj = new ReverseStrRecursion();
        System.out.println(obj.reverseStr(str));

    }

    private String reverseStr(String str) {
        if (str!= null && !str.isEmpty()) {
            System.out.println(">" + str.charAt(0));
            System.out.println(str.substring(1));
            str = reverseStr(str.substring(1)) + str.charAt(0);
        }

        return str;
    }
}
