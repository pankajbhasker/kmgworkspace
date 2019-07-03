package com.bhasker.dgstack.collectionpro;

public class SumMDArray {

    public static void main(String[] args) {
        int rows, cols;

        //Initialize matrix a
        int a[][] = {
                {1, 0, 1},
                {4, 5, 6},
                {1, 2, 3}
        };

        //Initialize matrix b
        int b[][] = {
                {1, 1, 1},
                {2, 3, 1},
                {1, 5, 1}
        };

        //Calculates number of rows and columns present in given matrix
        rows = a.length;
        cols = a[0].length;

        //Array sum will hold the result
        int sum[][] = new int[rows][cols];

        //Performs addition of matrices a and b. Store the result in matrix sum
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition of two matrices: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
