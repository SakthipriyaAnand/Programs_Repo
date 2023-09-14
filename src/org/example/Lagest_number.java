package org.example;

import java.util.Scanner;

public class Lagest_number {

	public static void main(String[] args) {
		int num=10,num1=20;
		if(num>num1) {
			System.out.println("Largest number: "+num);
		}
		else {
			System.out.println("largest number:"+num1);
		}
	System.out.println("-------------------------------------");
		Scanner Lagest_number = new Scanner(System.in);
	System.out.println("Enter first input: ");
		int a=Lagest_number.nextInt();
		System.out.println("Enter second input: ");
		int b=Lagest_number.nextInt();
		if(a>b) {
			System.out.println("Largest number: "+a);
		}
		else {
			System.out.println("largest number:"+b);
		}
		Lagest_number.close();
System.out.println("------------------------------------");
System.err.println("Using Ternary operator");
		int n1=22,n2=33;
		int var1=(n1>n2)?n1:n2;
		System.out.println("Largest: "+var1);
		
	}
	
	
	

}
