package com.bhasker.dgstack.programms;

import java.util.Scanner;
/*
In an Armstrong Number, the sum of power of individual digits is equal to number itself.

In other words the following equation will hold true

xy..z = xn + yn+.....+ zn

EX:  153,  370,  371

 */
public class ArmstrongCheck {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check if its an Armstrong or not : ");
        int num = sc.nextInt();

        boolean isArmstrong = ArmstrongCheck.isArmStrong(num);
        if (isArmstrong)
            System.out.println("Given Number : " + num
                    + " is an Armstrong number.");
        else
            System.out.println("Given Number : " + num
                    + " is not an Armstrong number.");

    }

    public static boolean isArmStrong(int actualNum) {

        int tempNumber = actualNum;
        int digitCubeSum = 0;
        int digit = 0;
        while ( tempNumber != 0 ) {
            digit = tempNumber % 10;
            digitCubeSum = digitCubeSum + (digit * digit * digit);
            tempNumber = tempNumber / 10;

        }
        if (digitCubeSum == actualNum)
            return true;
        else
            return false;

    }
}

