package org.test.prog;

public class ArrayDesecnding {
	public static void main(String[] args) {
		int a[] = {3,1,2,5,4};
	
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
		}
		
		for (int x : a) {
			System.out.println(x);
			
		}
		System.out.println("second largest "+a[1]);
	}


}
