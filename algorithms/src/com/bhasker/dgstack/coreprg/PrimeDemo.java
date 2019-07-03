package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {

		System.out.println("Enter any Number");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int flag = 1;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = 0;
				break;
			}
		}

		if (flag == 1)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}