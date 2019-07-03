package com.bhasker.dgstack.coreprg;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		int num1 = 30;
		int num2 = 20;
		int num3 = 15;

		//
		// if(num1>=num2)
		// {
		// if(num1>=num3) {
		// System.out.println(num1+" is the largest Number");
		// }
		// else {
		// System.out.println(num3+" is the largest Number");
		// }
		// }
		// else {
		// if(num2>=num3)
		// {
		// System.out.println(num2+" is the largest Number");
		// }
		// else
		// {
		// System.out.println(num3+" is the largest Number");
		// }
		// }
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is the largest Number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the largest Number");
		} else
			System.out.println(num3 + " is the largest Number");

	}

}
