package com.bhasker.dgstack.patterns;
import java.util.Scanner;
/*


        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
   1 5 10 10 5 1
  1 6 15 20 15 6 1
 1 7 21 35 35 21 7 1

 */
public class PascalTrianglePattern {


    public static void main(String args[])
    {
        int r;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        r = scan.nextInt();

        for(int i=0;i<r;i++)
        {
            for(int k=r; k>i; k--)
            {
                System.out.print(" ");
            }
            int number=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(number+ " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
