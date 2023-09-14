package org.example;

public class Even_numbers {

	public static void main(String[] args) {
		
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
System.out.println("-----------------------------------");

		int a=2;
		do {
			if(a%2==0) {
				System.out.println(a);
			}
			a++;
		}while(a<=50);
	}

}
