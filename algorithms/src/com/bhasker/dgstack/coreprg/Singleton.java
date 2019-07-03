package com.bhasker.dgstack.coreprg;
public class Singleton {
	private static Singleton s;

	private Singleton() {

	}

	public static Singleton getSingleton() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

	public static void main(String args[]) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();

		System.out.println();
		System.out.println(+s2.hashCode());

		if (s1 == s2) {
			System.out.println("true");
		}
	}
}
