package com.bhasker.dgstack;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int lowerInput = 8;
        int upperInput = 20;
        int value = 0;
        boolean isSatisfy = true;

        while ( isSatisfy) {
            try{
                value = input.nextInt();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            if (value < lowerInput) {
                System.out.println("Input value is lower than expected.");
            } else if (value > upperInput) {
                System.out.println("Input is greater than expected.");
            } else {
                System.out.println("Input value is > " + value);
                isSatisfy = false;
            }
        }
    }
}
