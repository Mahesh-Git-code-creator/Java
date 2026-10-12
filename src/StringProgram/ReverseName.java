package StringProgram;

import java.util.Scanner;

public class ReverseName {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter the name is ");

		Scanner somevalueName = new Scanner(System.in);

		String anotherName = somevalueName.next();

		System.out.println(anotherName);

		String rev = "";

		for (int i = anotherName.length() - 1; i >= 0; i--) {
			rev = rev + anotherName.charAt(i);
		}

		System.out.println("Reverse name is  " + rev);

	}

}
