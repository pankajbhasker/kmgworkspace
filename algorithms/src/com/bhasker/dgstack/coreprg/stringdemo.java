package com.bhasker.dgstack.coreprg;
public class stringdemo {

	public static void main(String[] args) {

		String s1 = "viki sakshita" + "  babu";
		String[] s2 = s1.split("//");

		for (String s3 : s2) {
			System.out.print(s3);
		}

	}
}
