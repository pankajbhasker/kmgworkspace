package com.bhasker.dgstack.programms;

import java.math.MathContext;

public class RoundCeilCheck {

    public static void main(String args[]){
        double a = 3.7;

        double b =3.5;

        double c = 3.2;

        System.out.println("Floor 3.7 > " + Math.floor(a)  + " < 3.5 > " + Math.floor(b) + " < 3.2 >" + Math.floor(c));

        System.out.println("Ceil 3.7 > " + Math.ceil(a)  + " < 3.5 > " + Math.ceil(b) + " < 3.2 >" + Math.ceil(c));

        System.out.println("Round 3.7 > " + Math.round(a)  + " < 3.5 > " + Math.round(b) + " < 3.2 >" + Math.round(c));




    }
}

/* Output is

Floor 3.7 > 3.0 < 3.5 > 3.0 < 3.2 >3.0
Ceil 3.7 > 4.0 < 3.5 > 4.0 < 3.2 >4.0
Round 3.7 > 4 < 3.5 > 4 < 3.2 >3

 */