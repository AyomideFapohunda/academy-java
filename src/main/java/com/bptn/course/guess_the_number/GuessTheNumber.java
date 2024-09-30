package com.bptn.course.guess_the_number;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Create a new scanner object named scan to read user input
		int targetNumber = 23; //Define integer variable and set it to 23. This is the number the user needs to guess
		int guess; //Declare an integer variable to store the user's guess
		
		System.out.println("Welcome to the Number Guessing game!"); // Prints a welcome message to the user
		
		// do-while loop ensures the code inside the loop runs at least once, even if the user guesses the number correctly on the first try
		do { 
			System.out.println("Please enter a number between 1 and 100: ");//Asks the user to enter a number
			guess = scan.nextInt(); //reads the user's input and store's it in the variable named guess
		
		if (guess < targetNumber) { //checks if the user's guess is lower than the target number
			System.out.println("Too low! Try again"); //Prints this if the user's guess is lower than target number
		} else if (guess > targetNumber) { //checks if the user's guess is higher than the target number
			System.out.println("Too high! Try again");//Prints this if the user's guess is higher than target number
		} else {
			System.out.println("Congratulations! You guessed the number correctly!"); //Prints this if the user's guess is correct
			}
		} while (guess != targetNumber); //The loop continues as long as the guess is not equal to the target number
		
		scan.close();



	}

}
