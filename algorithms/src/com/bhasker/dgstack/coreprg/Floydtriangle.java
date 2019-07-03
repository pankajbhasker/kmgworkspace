
package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class Floydtriangle {

	public static void main(String args[]) {

		int rows, num = 1, count, j;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter  the input value");

		rows = input.nextInt();

		for (count = 1; count <= rows; count++) {

			for (j = 1; j <= count; j++) {
				System.out.print(num + " ");
				num++;

			}
			System.out.println();
		}

	}
}
