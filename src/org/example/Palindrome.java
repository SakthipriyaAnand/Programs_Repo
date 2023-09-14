package org.example;

public class Palindrome {

	public static void main(String[] args) {
		String word="MADAM",reverse="";
		char re;
		for (int i = 0; i < word.length(); i++) {
			re=word.charAt(i);
			reverse=re+reverse;	
		}
		System.out.println(word);
		System.out.println(reverse);
		if(word.equals(reverse)) {
			System.out.println("It is a pallindrome");
		}
		else {
			System.out.println("It is not a pallindrome");
		}
		

	}

}
