package com.bhasker.dgstack.programms;

/*
The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 */
public class FibonacciSeries {

    public static void main(String args[]) {
        int seriesTill = 10;
        String series = "0 1";
        int previousNum = 0;
        int nextNum = 1;

        for (int i = 0; i < seriesTill; i++) {

            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
            series = series + ' ' + nextNum;

        }
        System.out.println("Fibonnaci Series between 0 to "+ seriesTill + " : " + series);
    }
}



