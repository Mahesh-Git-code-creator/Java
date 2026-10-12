package Examples;

public class GmailExamples {

	public static void main(String[] args) {

		String[] str = {"iddenzs3r2@lnovic.com", "qyscufrvjk@ruutukf.com", "mx17p1ldbc@gmeenramy.com",
				"nv4ezl0y16@yzcalo.com"};

		for (int i = 0; i < str.length; i++) {
			
			String[] allids =str[i].split("[@.]");
			
			for(int j=0; j<allids.length; j++) {
				
				System.out.print(allids[j]+"\t");
				
			}
              
			System.out.println();
		}

	}

}
