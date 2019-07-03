package com.bhasker.dgstack.patterns;

/*

 9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8
   7 7 7 7 7 7 7
    6 6 6 6 6 6
     5 5 5 5 5
      4 4 4 4
       3 3 3
        2 2
         1

 */
public class InvertedPiramidPattern {

    public static void main(String args[]){
        int series =9;

        for(int i=series; i>=1; i-- ){
            for(int j =1; j<= series-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" " +i);
            }
            System.out.println();
        }

    }
}
