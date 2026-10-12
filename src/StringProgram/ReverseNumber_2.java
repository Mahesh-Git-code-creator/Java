package StringProgram;

import java.util.Scanner;

public class ReverseNumber_2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter the number here ");

		Scanner name = new Scanner(System.in);

		int num = name.nextInt();

		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse number is " + rev);

	}

}
