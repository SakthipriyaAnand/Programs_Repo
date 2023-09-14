package org.example;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {
		int array[]= {11,33,55,77,22,88,6};
		String st[]= {"banana","carrot","apple"};
		
		Arrays.sort(array);
		Arrays.sort(st);
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(st));
		
	}

}
