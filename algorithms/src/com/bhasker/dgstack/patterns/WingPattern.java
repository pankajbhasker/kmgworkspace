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
public class WingPattern {

    public static void main(String args[]){

        for(int i=1; i<=9; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for(int i=8; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
