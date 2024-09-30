package com.bptn.course.word_encrypter;

import java.util.Scanner;

public class WordEncrypter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);//Create a Scanner object to read user input
	
	System.out.println("Enter a word: "); //Prompt the user to enter a word
	String word = scan.nextLine();//Read the input word from the user
	
	char[] charArray = word.toCharArray(); //Convert the input word to a character array
	
	//Iterate through each character in the charArray
	for (int i = 0; i < charArray.length; i++) {
		char currentChar = charArray[i]; //Get the current character
		
		if (Character.isLetter(currentChar)) {//Checks if the current character is a letter
			char encryptedChar; //Declare a variable to hold the encrypted character
			if(Character.isLowerCase(currentChar)) { //Checks if the current character is a lowercase letter
				//Encrypt the character by shifting it one position forward in the alphabet
				encryptedChar = (char) ((currentChar - 'a' + 1) % 26 + 'a');//Use modulo 26 to wrap around from 'z' to 'a'
			} else { //Otherwise it must be an uppercase letter
				//Encrypt the character similarly for uppercase letters
				encryptedChar = (char) ((currentChar - 'A' + 1) % 26 + 'A');//Use modulo 26 to wrap around from 'Z' to 'A'
			}
			charArray[i] = encryptedChar;//Replace the original character with the encrypted character in the array
		}
	}
		
		String encryptedWord = new String(charArray); //Convert the modified charArray back to a String
		System.out.println("Encrypted word: " + encryptedWord); //Output the encrypted word
		
		scan.close();
	
	
	}
	
}	
	

