package org.test.prog;

public class Palindrome {
	public static void main(String[] args) {
		String s="madam";
		String op="";
		
		for (int i = s.length()-1; i >=0; i--) {
			op=op+s.charAt(i);
			
		}
		if (s.equals(op)) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
