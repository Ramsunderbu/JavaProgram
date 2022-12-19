package org.test.prog;

public class CompareEquals {
	
	public static void main(String[] args) {
		String s="madam";
		String s1="madam";
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		String s2= new String("Greens");
		String s3= new String("Greens"); 
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}

}
