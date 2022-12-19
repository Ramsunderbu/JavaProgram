package org.test.prog;

public class withoutVariable {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swap");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		
		a=a+b;//a=10+20=>a=30
		b=a-b;//b=30-20=>b=10
		a=a-b;//a=30-10=>a=20
		
		System.out.println("after swapping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}

}
