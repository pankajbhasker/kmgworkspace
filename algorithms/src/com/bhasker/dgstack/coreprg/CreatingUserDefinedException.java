package com.bhasker.dgstack.coreprg;
public class CreatingUserDefinedException extends Exception {

	public CreatingUserDefinedException(String s) {
		super(s);
	}

}

class Example {
	void m1() throws CreatingUserDefinedException {
		System.out.println("from example");
		throw new CreatingUserDefinedException("userdefined exception");
	}
}

class Main {
	public static void main(String args[]) {
		Example e = new Example();
		// e.m1();
		try {
			e.m1();
			l1: {
				System.out.println("from return");
			}
		} catch (NullPointerException e1) {
			// System.out.println("from catch block");
		}
		/*
		 * catch(CreatingUserDefinedException e2) {
		 * System.out.println("from catch block"); }
		 */
		catch (Exception e3) {
			System.out.println("from exception class");
			// return l1;
		} catch (Throwable t) {
			System.out.println("it is base class for all exceptions");

		}
	}
}
