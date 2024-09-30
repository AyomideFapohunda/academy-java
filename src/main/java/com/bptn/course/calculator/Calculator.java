package com.bptn.course.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		
		 // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);
        int choice;
        double firstNumber;
        double secondNumber = 0; //Used to store the second number
        
        
        //Display the calculator menu
        do {
        System.out.println("Calculator Menu");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 to square a number");
        System.out.println("Press 6 to find a square root");
        System.out.println("Press 7 to find the reciprocal");
        
       
        //Get the user's choice
        System.out.println("Enter your choice: ");
        choice = scan.nextInt();
        
        if (choice >= 1 && choice <= 7) {
            // Get the first number from the user
            System.out.print("Enter the first number: ");
            firstNumber = scan.nextDouble();
            
            // Get the second number from the user depending on the choice selected
            if (choice >= 1 && choice <= 4) { //If user choice between choice 1-4, it asks for a second number
            	System.out.print("Enter the second number: "); 
            	secondNumber = scan.nextDouble();    
            }
    
            // Initialize a variable to store the result
            double result;
            
           //Use an if-else-if statement to perform calculations based on the option     
            if (choice == 1) {
            	result = firstNumber + secondNumber;
            	System.out.println("The addition of " + firstNumber + " and " + secondNumber + " is " + result);
            } else if (choice == 2) {
            	result = firstNumber - secondNumber;
            	System.out.println("The subtraction of " + firstNumber + " and " + secondNumber + " is " + result);
            } else if (choice == 3) {
            	result = firstNumber * secondNumber;
            	System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + result);
            } else if (choice == 4) {
            	result = firstNumber / secondNumber;
            	System.out.println("The division of " + firstNumber + " and " + secondNumber + " is " + result);
            } else if (choice == 5) {
            	result = firstNumber * firstNumber;
            	System.out.println("The square of " + firstNumber  + " is " + result);
            } else if (choice == 6) {
            	result = Math.sqrt(firstNumber);
            	System.out.println("The squareroot of " + firstNumber + " is " + result);
            } else if (choice == 7) {
            	result = 1 / firstNumber;
            	System.out.println("The reciprocal of " + firstNumber + " is " + result);
            	}
        	} else {
            	System.out.println("Invalid choice! Please make a valid choice");
        			}
        	// Ask user if they want to continue
        	System.out.println("To continue calculation Press 1, else press any other number to exit: ");
        	choice = scan.nextInt();

        	} while (choice == 1); // Loop continues only if user chooses 1
        
        // Print the result
        	scan.close();
        	System.out.println("Exiting the calculator");
	}
		

}



