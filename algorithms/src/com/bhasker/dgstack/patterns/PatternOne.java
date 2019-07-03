package com.bhasker.dgstack.patterns;

/*

 * * * *
 * * * *
 * * * *
 * * * *

 */

/*

 * * * * * * * * * *
 * * * * * * * * * *
 * *             * *
 * *             * *
 * *             * *
 * *             * *
 * *             * *
 * *             * *
 * * * * * * * * * *
 * * * * * * * * * *

 */
public class PatternOne {

    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                if ((i == 1 || i == 2 || i == 10 || i == 9 || j == 1 || j == 2 || j == 10 || j == 9)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
