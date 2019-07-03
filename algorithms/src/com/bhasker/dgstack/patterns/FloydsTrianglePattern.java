package com.bhasker.dgstack.patterns;

public class FloydsTrianglePattern {

    public static void  main(String args[]){
        int num=0;
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i;j++){
                num++;
                System.out.print(" "+num);
            }
            System.out.println();
        }

    }
}
