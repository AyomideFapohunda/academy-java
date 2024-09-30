package com.bptn.course._06_factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
		if (number < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		} else {
			int factorial = 1;
			for (int i = 1; i <= number; i++) {
			factorial *=i;
			}
		
		System.out.println("Factorial of " + number + " is: " + factorial);
		}
		scan.close();

	}

}
