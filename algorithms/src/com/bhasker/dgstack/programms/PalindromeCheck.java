package com.bhasker.dgstack.programms;

import java.util.Scanner;

/*
A Palindrome Number is a number that even when reversed is same as original number

Examples of Palindrome Number

Number: 121, 393, 34043, 111, 555, 48084
String :  MADAM, LOL, NANA, ALA



 */
public class PalindromeCheck {

    public static void main(String args[]) {
        checkPalineDrome();
    }

    public static void checkPalineDrome() {
        System.out.println("Enter a valid input to check if its a Palindrome : ");
        Scanner sc1 = new Scanner(System.in);
        try {
            String num = sc1.nextLine().trim();
            boolean isValidNum = isNumberValid(num);
            if (isValidNum) {
                System.out.println(isPalindromeNum(Integer.parseInt(num)));
            } else {
                System.out.println(isPalindromStr(num));
            }

        } catch (Exception e1) {
//          Getting Input from user recursively till valid input to check Palindrome
//          checkPalineDrome();
            e1.printStackTrace();
        }
    }

    public static boolean isNumberValid(String input) {
        try {
          Integer.parseInt(input);

        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isPalindromeNum(int num) {

        String oppStr = "";
        int tempNum = num;
        int digit = 0;
        String actualStr = String.valueOf(tempNum);
        while ( tempNum != 0 ) {
            digit = tempNum % 10;
            oppStr = oppStr + digit;
            tempNum = tempNum / 10;

        }
        if (actualStr.equals(oppStr)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromStr(String actualStr) {
        String oppStr = "";

        char[] c = actualStr.toCharArray();
        for (int i = c.length-1 ; i >= 0; i--) {
            oppStr = oppStr + c[i];
        }
        if (actualStr.equals(oppStr.trim())) {
            return true;
        } else {
            return false;
        }
    }
}
