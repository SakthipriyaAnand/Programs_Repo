package org.example;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		int num,rem,cube=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		int temp=num;
		int digit = (int)Math.log10(num) + 1; // to find the number of digits
		while(num>0) {
			rem=num%10;
			//cube=cube+(rem*rem*rem);			 	//for only 3 digits
			cube +=(int) Math.pow(rem, digit); 		// rem^digit
			num=num/10;
		}
			if (temp==cube) {
				System.out.println("Armstrong Number");
			}
			else {
				System.out.println("Not Armstrong Number");
			}
			sc.close();
	}

}
