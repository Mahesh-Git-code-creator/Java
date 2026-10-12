package StringProgram;

public class String_class_01 {

	public static void main(String[] args) {

		String s1 = "FLM";

		String s2 = "flm";

		String s3 = new String("New FLM");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));

		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s3.contains(s1));

	}

}
