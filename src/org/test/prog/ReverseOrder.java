package org.test.prog;

public class ReverseOrder {
	public static void main(String[] args) {
		
		String s= "Greens";
		String op= "";
		
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			op = op+c;
			
			
		}
		System.out.println(op);
	}

}
