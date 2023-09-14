package org.example;

public class TwoD_array {

	public static void main(String[] args) {
		int[][] array= {{2,6,8},{45 ,23 ,1},{35,6,9}};
		
		int minNumber = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < minNumber) {
					minNumber = array[i][j];
					System.out.println(minNumber);
				}
				
				
			}
		}
		

	}

}
