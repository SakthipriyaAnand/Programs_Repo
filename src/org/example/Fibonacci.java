package org.example;

public class Fibonacci {

	public static void main(String[] args) {
		int i=10,fn=0,sn=1;
		System.err.println("Fibonacci series");
		for (int j = 1; j <=i; ++j) {
			
			System.out.print(fn+",");
			int output=fn+sn;
			fn=sn;
			sn=output;
			
		}
	}
}
