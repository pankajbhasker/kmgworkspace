package com.bhasker.dgstack.programms;

import java.util.Scanner;

/*
In an Armstrong Number, the sum of power of individual digits is equal to number itself.

In other words the following equation will hold true

xy..z = xn + yn+.....+ zn

EX:  153,  370,  371

 */
public class ArmStrongSeries {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to generate the series of an Armstrong number : ");
        int seriesTill = sc.nextInt();

        StringBuilder series = new StringBuilder(" ");
        for (int i = 0; i <= seriesTill; i++) {
            boolean isArmstrong = isArmStrong(i);
            if (isArmstrong) {
                series.append(" " + i);
            } else {
                isArmstrong = false;
            }

        }
        System.out.println("Series : " + series);


    }

    public static boolean isArmStrong(int number) {
        int tempNumber = 0;
        int digit = 0;
        int digitCube = 0;
        boolean isArmStrong = false;
        tempNumber = number;
        while ( tempNumber != 0 ) {
            digit = tempNumber % 10;
            System.out.println(digit);
            digitCube = digitCube + (digit * digit * digit);
            tempNumber = tempNumber / 10;
        }

        if (digitCube == number) {
            isArmStrong = true;
        } else {
            isArmStrong = false;
        }
        return isArmStrong;

    }

}
