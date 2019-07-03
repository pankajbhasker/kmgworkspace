package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {

		String rev = " ";

		String str = new String("chandra");

		System.out.println("enter a string");

		int len = str.length();

		for (int i = len - 1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);
	}

}
