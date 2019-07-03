package com.bhasker.dgstack.coreprg;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("enter the length of the array");
		int len = s.nextInt();

		int a[] = new int[len];

		for (int i = 0; i < len; i++) {
			System.out.println("enter the " + i + " th number");
			a[i] = s.nextInt();
		}
		Arrays.sort(a);

		for (int i = 0; i < len; i++)
			System.out.print(a[i] + "  ");
	}

}