package Examples;

public class singleTerm {

	public static void main(String[] args) {

		String str1 = "iddenzs3r2@lnovic.com";
		String str2 = "qyscufrvjk@ruutukf.com";
		String str3 = "mx17p1ldbc@gmeenramy.com";

		String[] part1 = str1.split("[@]");

		String[] part2 = str2.split("[@.]");

		String[] part3 = str3.split("[@.]");

		for (int i = 0; i < part1.length; i++) {
			System.out.print(part1[i]);
		}

		System.out.println();

		for (int i = 0; i < part2.length; i++) {
			System.out.print(part2[i]);
		}

		System.out.println();

		for (int i = 0; i < part3.length; i++) {
			System.out.print(part3[i]);
		}

		System.out.println();

	}

}
