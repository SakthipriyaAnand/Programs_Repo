package org.example;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i,j;
		for(i=2;i<=50;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0)
					break;	
			}
			if(i==j) {
				System.out.println(i);
			}
		}	
System.out.println("-----------------------------------");
		int i1=2,j1;
		do {
			for(j1=2;j1<=i1;j1++) {
				if(i1%j1==0)
					break;
			}
				if(i1==j1) {
					System.out.println(i1);
				}
		i1++;
		}while(i1<=50);
		
		
	}
}


