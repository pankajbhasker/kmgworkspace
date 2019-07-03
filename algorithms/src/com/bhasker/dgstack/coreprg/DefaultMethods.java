package com.bhasker.dgstack.coreprg;

interface MyInterface {
	
		default void newMethod() {
			System.out.println("Newly added default method");
		}
	
		void existingMethod(String str);
	}
	
	interface MyInterface2 {
	
		default void newMethod() {
			System.out.println("Newly added default method");
		}
	
		void disp(String str);
	}
	
	public class DefaultMethods implements MyInterface, MyInterface2 {
		// implementing abstract methods
		public void existingMethod(String str) {
			System.out.println("String is: " + str);
		}
	
		public void disp(String str) {
			System.out.println("String is: " + str);
		}
	
		// Implementation of duplicate desfault method
		public void newMethod() {
			System.out.println("Implementation of default method");
		}
	
		public static void main(String[] args) {
			DefaultMethods obj = new DefaultMethods();
	
			// calling the default method of interface
			obj.newMethod();
	
		}
	}