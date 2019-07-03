package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {

		System.out.println("enter the string");

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				System.out.println(c);
				count++;
			}
		}
		System.out.println(count);
	}
}
