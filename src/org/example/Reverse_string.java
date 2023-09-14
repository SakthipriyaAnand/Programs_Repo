package org.example;

public class Reverse_string {

	public static void main(String[] args) {
		String word="Hello People",reverse="";
		char re;
		for (int a = 0; a < word.length(); a++) {
			re=word.charAt(a);
			reverse=re+reverse;	
		}
		System.out.println("Given string: "+word);
		System.out.println("Reverse string: "+reverse);
	
	System.out.println("-----------------------------------------------------------------");
		String str = "Hello people";
		String[] strArray = str.split(" ");
		System.out.println("Given string: "+str);
		System.out.print("Reverse string: ");
		for(int i=0; i<=1; i++){
			char[] s1 = strArray[i].toCharArray(); 
		for (int j = s1.length-1; j>=0; j--)
		{
			System.out.print(s1[j]);
			}
			System.out.print(" ");
		}
	}

}
