package com.bhasker.dgstack.coreprg;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double num1;
		double num2;

		System.out.println("Enter first number");

		Scanner input = new Scanner(System.in);

		num1 = input.nextDouble();

		System.out.println("Enter   Second number");

		num2 = input.nextDouble();

		System.out.println("Enter   an oprator (+,-,*,/):");
		char opr = input.next().charAt(0);
		input.close();
		double output;

		switch (opr) {
		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;
		case '/':
			output = num1 / num2;
			break;

		default:
			System.out.printf("You have entered wrong operator");
			return;

		}

		System.out.println(num1 + " " + opr + " " + num2 + ": " + output);
	}
}
