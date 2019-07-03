package com.bhasker.dgstack.coreprg;
import java.util.Date;
import java.util.TreeSet;

public class StarProgram {
	public static void main(String args[]) {
		int m = 0;

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
