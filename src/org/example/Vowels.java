package org.example;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		char c='s';
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
			System.out.println("The given character is a vowel");
			
		}
		else {
			System.out.println("The given character is a consonant");
		}
		
		System.out.println("------------------------------------------------");
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a character: ");  
	
		char c0=sc.next().charAt(0);
		if(c0=='a'||c0=='e'||c0=='i'||c0=='o'||c0=='u'){
			System.out.println("The given character is a vowel");
			
		}
		else {
			System.out.println("The given character is a consonant");
		}
		sc.close();
	}

}
