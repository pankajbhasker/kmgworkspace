import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {

		System.out.println("please enter the number");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int sum = 0, rem;

		while (num > 0) {

			rem = num % 10;
			System.out.println(rem);
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("the sum of the elements is=" + sum);

	}

}
