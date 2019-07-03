package com.bhasker.dgstack.coreprg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {

		// DataInputStream dis=new DataInputStream(System.in);
		// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of objects:");

		int num = sc.nextInt();

		Object obj[] = new Object[num];

		for (int i = 0; i < num; i++) {
			System.out.println("enter the " + i + " th object");
			obj[i] = sc.next();
		}

		Arrays.sort(obj);

		for (int i = 0; i < num; i++) {
			System.out.print(obj[i] + " ");
		}

	}

}
