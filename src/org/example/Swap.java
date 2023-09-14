package org.example;

public class Swap {

	public static void main(String[] args) {
		int a=1,b=2;
		System.out.println("Before swapping: a="+a+" b="+b);
		int c=a;  //c=1
		a=b;      //a=2
		b=c;      //b=1
		System.out.println("After swapping: a="+a+" b="+b);
System.out.println("-----------------------------------------------");
		int a1=10,b1=20;
		System.out.println("Before swapping: a="+a1+" b="+b1);
		a1=a1+b1;  //a1=30
		      
		b1=a1-b1;      //b1=10
		a1=a1-b1;        //a1=20
		System.out.println("After swapping: a="+a1+" b="+b1);
	}
	
	

}
