package org.example;

public class Driving {

	public static void main(String[] args) {
		
		int age=20;
		if(age>18) {
			System.out.println("valid for licence: "+age);
		}
			else {
				System.out.println("not valid for licence: "+age);
			}
		
System.out.println("----------------------------------------");
		
		int mat=70,sci=80,eng=90,french=10;
		if (mat>=60 && sci>=50 && (eng>=40 || french>=34)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
