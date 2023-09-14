package org.example;

public class Even {
	//public class EvenOddSumAverage {
	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Please provide some numbers as command-line arguments.");
	            return;
	        }

	        int evenSum = 0;
	        int oddSum = 0;
	        int evenCount = 0;
	        int oddCount = 0;

	        for (String arg : args) {
	            try {
	                int num = Integer.parseInt(arg);
	                if (num % 2 == 0) {
	                    evenSum += num;
	                    evenCount++;
	                } else {
	                    oddSum += num;
	                    oddCount++;
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input: " + arg);
	            }
	        }

	        if (evenCount > 0) {
	            double evenAverage = (double) evenSum / evenCount;
	            System.out.println("Even Sum: " + evenSum);
	            System.out.println("Even Average: " + evenAverage);
	        } else {
	            System.out.println("No even numbers provided.");
	        }

	        if (oddCount > 0) {
	            double oddAverage = (double) oddSum / oddCount;
	            System.out.println("Odd Sum: " + oddSum);
	            System.out.println("Odd Average: " + oddAverage);
	        } else {
	            System.out.println("No odd numbers provided.");
	        }
	    }
	}

