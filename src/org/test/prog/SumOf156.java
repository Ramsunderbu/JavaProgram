package org.test.prog;

public class SumOf156 {
	public static void main(String[] args) {
		int num =156;
		int i=0, j=0, a=num;
		while (a > 0) {
			i=a % 10;
			j=(j) + i;
			a= a / 10;
			
		}
		System.out.println(j);
	}

}
