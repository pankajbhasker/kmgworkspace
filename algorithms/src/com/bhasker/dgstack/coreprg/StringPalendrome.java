package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

class StringPalendrome {
	public static void main(String args[]) {

		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		char ch[] = s.toCharArray();

		int len = ch.length;

		int j, flag = 0;

		for (int i = 0, j1 = len - 1; j1 > 0; i++, j1--) {
			if (ch[i] == ch[j1])
				flag = 1;
			else {
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			System.out.println("entered string is:  pallindrome");
		else
			System.out.println("enterr" + "d string is:  not a pallindrome");

	}
}
