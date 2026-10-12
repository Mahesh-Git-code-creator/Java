package StringProgram;

import java.util.Scanner;

public class String_Reverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Enter the name is ");

		Scanner somevalueName = new Scanner(System.in);

		String anotherName = somevalueName.next();

		ReverseOfName(anotherName);

	}

	private static void ReverseOfName(String name) {

		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		System.out.println("Reverse name is  " + rev);

	}

}
