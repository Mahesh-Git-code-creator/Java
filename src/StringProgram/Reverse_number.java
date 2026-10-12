package StringProgram;

import java.util.Scanner;

public class Reverse_number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter the number");

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		reverseOfnumber(num);
		
		 

	}

	private static void reverseOfnumber(int num) {

		int rev = 0;

		while (num > 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("Reverse number is " + rev);

	}

}
