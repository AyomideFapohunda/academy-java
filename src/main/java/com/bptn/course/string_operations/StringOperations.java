package com.bptn.course.string_operations;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		 // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);
        
        String choice; //Variable to store the user's menu choice
        String reverseInput = ""; //Initialize for reversing
        
  
        do {
        //Display the menu
        
        System.out.println(" String Menu");
        System.out.println("Press 1 for Palindrome Check");
        System.out.println("Press 2 to reverse a String");
        System.out.println("Press 3 to Concatenate two Strings");
        System.out.println("Press 4 for String Comparison");
        System.out.println("Press 5 to Calculate the Length of String");
        
        //Get the user's choice
        System.out.println("Enter your choice: ");
        choice = scan.nextLine();
        
        //Use a switch statement to handle the different menu options
        
        switch (choice) {
        	case "1":
	        	System.out.println("Enter a string: ");
	        	String input = scan.nextLine();
	        	
	        	
	        	//Reverse the input string
	        	
	        	for (int i = input.length() - 1; i >= 0; i--) {
	            	reverseInput += input.charAt(i);
	            }
	        	
	        	//check for palindrome
	        	
	        	if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
	        		 System.out.println("Input string is palindrome");
	            } else {
	                System.out.println("Input string is not palindrome");
	        	}
	        	break;
	        	
	        case "2":
	        	System.out.println("Enter a string: ");
	        	input = scan.nextLine();
	        	
	        	//Reverse the input string
	        	
	        	for (int i = input.length() - 1; i >= 0; i--) {
	            	reverseInput += input.charAt(i);
	            }
	        	
	        	System.out.println("The reversed string is: " + reverseInput);
	        	break;
	        	
	        case "3":
	        	System.out.println("Enter the first string: ");
	        	String str1 = scan.nextLine();
	        	System.out.println("Enter the second string: ");
	        	String str2 = scan.nextLine();
	        	
	        	String concatenatedString = str1 + str2; //Concatenate two strings
	        	System.out.println("Concatenated string: " + concatenatedString);
	        	break;
	        	
	        case "4": 
	        	System.out.println("Enter the first string: ");
	        	str1 = scan.nextLine();
	        	System.out.println("Enter the second string: ");
	        	str2 = scan.nextLine();
	        	
	        	int comparisonResult = str1.compareTo(str2);// compare the two strings 
	     
	        	System.out.println(comparisonResult == 0? "The entered strings are equal" :  "The entered strings are not equal");
	        	break;
	        	
	        case "5":
	        	System.out.println("Enter a string: ");
	        	String str = scan.nextLine(); 
	        	
	        	System.out.println("The length of the entered string is: " + str.length());
	        	break;
	        	
	        default:
	        	System.out.println("Invalid choice. Please make a valid choice");
        	}
        } while (!choice.equals("5")); //
        		
        scan.close();
	       
	     
      

	}

}
