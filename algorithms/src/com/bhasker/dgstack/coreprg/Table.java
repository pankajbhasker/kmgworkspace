package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		System.out.println("enter the number");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(+n + " * " + i + " " + "=" + " " + +(n * i));
		}

	}

}
