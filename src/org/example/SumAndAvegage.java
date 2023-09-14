package org.example;

public class SumAndAvegage {

	public static void main(String[] args) {
		
	int i,sumEven=0,sumOdd=0,evencount=0,oddcount=0;
	for (i = 0; i < args.length; i++) {
		System.out.println(args[i]);
		if((i%2)==0) {
			sumEven +=i;
			evencount++;
		}
		else {
			sumOdd +=i;
			oddcount++;
		}
	}
	System.out.println("sum of even:" + sumEven);
	System.out.println("sum of odd:"+sumOdd);
	
	evencount =sumEven/evencount;
	oddcount= sumOdd/oddcount;
	System.out.println("average Even:"+evencount);
	System.out.println("average Odd:"+oddcount);
	
	}
}

