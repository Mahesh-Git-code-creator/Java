package StringProgram;

public class String_Char {

	public static void main(String[] args) {
		 
		String s1="Mahesh";
		
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		char[] ch=	s1.toCharArray();
		System.out.println(ch.length);
		
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		  

	}

}
