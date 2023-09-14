package org.example;

public class Duplicate_string {

	public static void main(String[] args) {
		String s="Shimakh Technology";
		char[] c=s.toCharArray();
		System.out.println("Given String: "+s);
		System.out.print("Duplicated: ");
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(c[i]==c[j]) {
					
					System.out.print(c[j]+" ");
					break;
					
					
				}
			}
			
		}
	}

}
