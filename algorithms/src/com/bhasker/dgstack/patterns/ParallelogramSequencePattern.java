package com.bhasker.dgstack.patterns;
/*

           * * * * * * * * *
          * * * * * * * * *
         * * * * * * * * *
        * * * * * * * * *
       * * * * * * * * *
      * * * * * * * * *
     * * * * * * * * *
    * * * * * * * * *
   * * * * * * * * *


 */
public class ParallelogramSequencePattern {

    public static void main(String args[]){
        int series = 9;
        for(int i =1; i<=series; i++){
            for(int j= series; j>i; j--) {
                    System.out.print(" ");

            }
            for(int j=0; j<series; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

/*
   for(int k=0; k!=i ;k++){
                System.out.print(i+ " ");
            }
 */