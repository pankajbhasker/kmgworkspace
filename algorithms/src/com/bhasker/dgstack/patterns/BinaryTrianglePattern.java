package com.bhasker.dgstack.patterns;
/*
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
 0 1 0 1 0 1
 1 0 1 0 1 0 1
 0 1 0 1 0 1 0 1
 1 0 1 0 1 0 1 0 1
 0 1 0 1 0 1 0 1 0 1

 */
public class BinaryTrianglePattern {
    public static void main(String arts[]){
        for(int i =1; i<=10; i++) // rows
             {
            for(int j= 1; j<=i; j++) // col
            {
                      if((i+j) % 2 ==0){
                        System.out.print(" 1" );
                    }else {
                        System.out.print(" 0");
                    }

            }
            System.out.println();
        }
    }
}
