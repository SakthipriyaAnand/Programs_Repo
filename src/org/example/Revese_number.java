package org.example;

public class Revese_number {

	public static void main(String[] args) {
		int a=2358,re=0;
		System.out.println("Number: "+a);
		while(a>0) {
			int c=a%10;
			re=re*10+c;
			//System.out.print(c);
			//break;
			a=a/10;
		}
		
		System.out.println("Reverse number: "+re);

	}

}
