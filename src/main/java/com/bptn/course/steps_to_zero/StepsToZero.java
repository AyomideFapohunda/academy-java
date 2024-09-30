package com.bptn.course.steps_to_zero;

import java.util.Scanner;

public class StepsToZero {
	
	public static int numberOfSteps(int num) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
		int steps = 0;
		
			if (number <= 0 || number >= Math.pow(10, 6)) {
				 System.out.println("Wrong number");
			}
			
			else {
		   
			while (number != 0){
	          if (number % 2 == 0){
	            number /= 2;
	          } else {
	             number--;
	          }
	          steps++;
			}
			
	
		}
			return steps;

		
	}

	
	public static void main(String[] args) {
		//Test 1
		int num = 123;
		int steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
		
		// Test 2\n"
		num = 14;
		steps = numberOfSteps(num);
		System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
		
	}

	
}


