package com.bhasker.dgstack.coreprg;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {

		int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");

		n = sc.nextInt();

		BigInteger fact = new BigInteger("1");

		for (i = 1; i < n; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		System.out.println("factorial of the number=" + fact);
	}

}