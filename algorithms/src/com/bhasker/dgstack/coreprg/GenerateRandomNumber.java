package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		int counter;
		Scanner input = new Scanner(System.in);
		/*
		 * Below code would generate 5 random numbers between 0 and 200.
		 */
		System.out.println("Random Numbers:");
		System.out.println("***************");
		for (counter = 1; counter <= 5; counter++) {
			System.out.println(input.nextInt(100));
		}
	}
}
