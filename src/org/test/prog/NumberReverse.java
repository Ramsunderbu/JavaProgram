package org.test.prog;

public class NumberReverse {
	public static void main(String[] args) {
		int num =151;//12345
		int i=0, j=0, a=num;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			
		}
		
//		System.out.println(j);
		if (j == num) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}


}
