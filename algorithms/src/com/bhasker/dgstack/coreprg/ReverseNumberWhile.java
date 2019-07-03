package com.bhasker.dgstack.coreprg;
import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int reverse = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the input value");

		num = input.nextInt();
		
		// System.out.println("Useing while loop");
		// while(num != 0)
		// {
		// reverse = reverse*10;
		// reverse = reverse + num%10;
		// System.out.println(reverse);
		// num = num/10;
		//
		// }

		// System.out.println("Useing for loop");
		//
		// for( ;num != 0; )
		// {
		// reverse = reverse * 10;
		// reverse = reverse + num%10;
		// num = num/10;
		// }

		// System.out.println("Reverse a number using recursion");
		// /A method for reverse
		// public static void reverseMethod(int number) {
		// if (number < 10) {
		// System.out.println(number);
		// return;
		// }
		// else {
		// System.out.print(number % 10);
		// //Method is calling itself: recursion
		// reverseMethod(number/10);
		// }
		// }
		// public static void main(String args[])
		// {
		// int num=0;
		// System.out.println("Input your number and press enter: ");
		// Scanner in = new Scanner(System.in);
		// num = in.nextInt();
		// System.out.print("Reverse of the input number is:");
		// reverseMethod(num);
		// System.out.println();
		// }
		//

		System.out.println(" Reverse of input number is: " + reverse);

	}

}
