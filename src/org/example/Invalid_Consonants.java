package org.example;

import java.util.Scanner;

public class Invalid_Consonants {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a character: ");  
	
		char c0=sc.next().charAt(0);
		if(c0=='a'||c0=='e'||c0=='i'||c0=='o'||c0=='u'){
			System.out.println("The given character is a vowel");
			
		}
		else if(c0>='a'&&c0<='z')  {
			System.out.println("The given character is a consonant");
		}
		else {
			System.out.println("invalid");
		}
		sc.close();
	}

}
