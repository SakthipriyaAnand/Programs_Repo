package org.example;

public class Vowels_word {

	public static void main(String[] args) {
		String wo="sakthi";
		int vowels=0,consonants=0;
		for (int i = 0; i < wo.length(); i++) {
			char w1=wo.charAt(i);
			if(w1=='a'||w1=='e'||w1=='i'||w1=='o'||w1=='u') {
				System.out.println("vowels:"+w1);
				vowels++;
			}
			else {
				System.out.println("consonants: "+w1);
				consonants++;
			}
		}

	}

}
