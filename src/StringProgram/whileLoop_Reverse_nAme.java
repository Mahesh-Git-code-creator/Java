package StringProgram;

import java.util.Scanner;

public class whileLoop_Reverse_nAme {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		while (true) {

			System.out.println("enter the name is here ");

			Scanner inputclass = new Scanner(System.in);

			String name = inputclass.next();

			String rev = "";
			if (name.contains(rev)) {
				for (int i = name.length() - 1; i >= 0; i--) {
					rev = rev + name.charAt(i);
				}

				System.out.println("Reverse name is " + rev);

			}

			else {
				System.out.println("teminate the value ");
			}

		}

	}
}
