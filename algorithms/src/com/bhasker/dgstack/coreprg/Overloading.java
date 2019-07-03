package com.bhasker.dgstack.coreprg;
public class Overloading {

	void demo(int a) {
		System.out.println("a=" + a);
	}

	void demo(int a, int b) {
		System.out.println("a and b are " + a + " ," + b);
	}

	double demo(double a) {
		System.out.println("double a=" + a);
		return a * a;
	}

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.demo(10);
		overloading.demo(10, 5);
		double result = overloading.demo(2.5);
		System.out.println(" the result of double=" + result);

	}
}
