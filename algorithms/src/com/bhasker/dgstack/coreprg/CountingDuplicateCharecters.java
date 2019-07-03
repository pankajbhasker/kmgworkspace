package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class CountingDuplicateCharecters {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter the string");
		String str = s.next();

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			int count = 1;

			if (ch[i] != '*') {
				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {
						count++;
						ch[j] = '*';
					}
				}

				System.out.println("character ch[i]+" + " repeated for:" + count);
			}

		}
	}
}
