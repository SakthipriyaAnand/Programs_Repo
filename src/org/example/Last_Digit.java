package org.example;

import java.util.Scanner;

public class Last_Digit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=input.nextInt();
		int ld1=Last_Digit.last(a);
		System.out.println("Last Digit: "+ld1);
		
		Scanner input1=new Scanner(System.in);
//		System.out.println("Enter number: ");
//		int b=input.nextInt();
		int mul1=Last_Digit.multi(ld1);
		System.out.println("Multiplication: "+mul1);
		input.close();
		
	}
	
	public static int last(int a){
		
//		Scanner input=new Scanner(System.in);
//		System.out.println("Enter number: ");
//		int a=input.nextInt();
		//int a;
		int ld=a%10;
		return ld;
		//System.out.println("Last Digit:"+ld);
		//input.close();
	}
	public static int multi(int id1) {
		int mul=id1*10;
		return mul;
	}

}
