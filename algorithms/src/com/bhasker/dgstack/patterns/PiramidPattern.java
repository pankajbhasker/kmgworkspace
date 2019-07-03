package com.bhasker.dgstack.patterns;
/*

      1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5
 6 6 6 6 6 6
7 7 7 7 7 7 7
8 8 8 8 8 8 8 8

 */
public class PiramidPattern {

    public static void main(String args[]){
        int series = 8;
        for(int i =1; i<=series; i++){
            for (int j=series-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for(int j =1; j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
}
