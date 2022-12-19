package org.test.prog;

public class upLoSpNuValue {
	
	public static void main(String[] args) {
		String s= "NIshA@123@@#";
		int upper=0, lower=0, special=0, number=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int x=c;
			if (x>=65 && x<=90) {
				upper++;
				
			}
			else if (x>=97 && x<=122) {
				lower++;
	
			}
			else if (x>=48 && x<=57) {
				number++;
				
			}
			else {
				special++;
			}
			System.out.println("upper count "+upper);
			System.out.println("lower count "+lower);
			System.out.println("special count "+special);
			System.out.println("number count "+number);
		}
	}

}
