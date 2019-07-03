package com.bhasker.dgstack.algorithms;

import java.util.Arrays;

/*
Bubble sort is an algorithm which compares the first element of the array/ list to the next one. If the current element
of the array /list is numerically greater than the next one,
the elements are swapped together. Likewise, the algorithm will traverse the entire element of the array/list.
 */
public class BubbleSortAlgo {

    public static void main(String args[]) {
        int arr[] = {23, 10, 22, 32, 43, 12, 92, 44, 76, 38};
        int tempArr[] = new int[arr.length];
        StringBuilder sb = new StringBuilder(" ");
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array Using Bubble sort: " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /* Using Java Utility

        Arrays.sort(arr);
        System.out.println("Sorted Array Using Bubble sort: " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        */

    }
}
