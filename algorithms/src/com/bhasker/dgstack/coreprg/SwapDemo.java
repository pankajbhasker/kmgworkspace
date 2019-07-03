package com.bhasker.dgstack.coreprg;
public class SwapDemo {

	public static void main(String[] args) {
		/*
		 * int a=20,b=10,temp;
		 * 
		 * temp=a; a=b; b=temp;
		 * 
		 * System.out.println("the value of a is="+a);
		 * System.out.println("the value of b is="+b);
		 */

		int a = 30, b = 45;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("the value of a is=" + a);
		System.out.println("the value of b is=" + b);

	}

}
