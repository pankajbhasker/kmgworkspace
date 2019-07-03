package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {

		int rev = 0, rem = 0;

		System.out.println("enter the number");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;

		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}
		if (rev == x) {
			System.out.println("the given number is palendrome");
		} else {
			System.out.println("the given number is not palemdrome");
		}

	}
}
