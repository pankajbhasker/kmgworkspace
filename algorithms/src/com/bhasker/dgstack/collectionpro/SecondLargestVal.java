package com.bhasker.dgstack.collectionpro;

public class SecondLargestVal {

    public static void main(String[] args) {

        int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
        int largest = arr[0];
        int secondLargest = arr[0];

        System.out.println("The given array is:" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }

        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("\nThird largest number is:" + getThirdLargest(arr));

    }

    public static int getThirdLargest(int[] a){
        int temp;
        int total = a.length;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-3];
    }
}
