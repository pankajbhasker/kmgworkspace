package com.bhasker.dgstack.patterns;

/*

 1 2 3 4 5 6 7 8 9
 1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7
 1 2 3 4 5 6
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1

 */
public class RevSeqTriPattern {

    public static void main(String args[]){

        for(int i =9; i >= 1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }


}
