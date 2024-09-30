package com.bptn.course.string_pluralizer;

import java.util.Scanner;

public class StringPluralizer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Create a scanner object

        System.out.print("Enter a number: "); //Ask the user for a number which determines singular/plural
        int number = scan.nextInt(); //Reads the user input


        System.out.print("Enter a noun: "); //Ask the user for a noun
        String noun = scan.next(); //Read the user input
        
        //Check if the number is negative

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else if (number == 1) { //If the number is 1, the noun should remain singular
            System.out.println(number + " " + noun);
        } else {
            String pluralNoun = noun; //If number is not 1, apply plural rules

            if (noun.endsWith("sh") || noun.endsWith("ch")) { //If noun ends with -sh or -ch, replace with -es to make it plural
                pluralNoun += "es";
                
                //If noun ends with -y but not -ay, -oy, -ey, -uy, replace with -ies
            } else if (noun.endsWith("y") && !noun.endsWith("ay") && !noun.endsWith("ey") && !noun.endsWith("oy") && !noun.endsWith("uy")) {
                pluralNoun = noun.substring(0, noun.length() - 1) + "ies";
                
                //If noun ends with -fe, replace with -ves
            } else if (noun.endsWith("fe")){
            	pluralNoun = noun.substring(0, noun.length() - 2) + "ves";
            	
            	//If noun ends with -us, replace with -i
            } else if (noun.endsWith("us")) {
            	pluralNoun = noun.substring(0, noun.length() - 2) + "i";
            	
            	//Replace with -s for all other cases
            } else {
                pluralNoun += "s";
            }

            System.out.println(number + " " + pluralNoun); //Print the plural form of the noun with the number
	        	
	        	
	        }
	        scan.close();
		
		
	}

}
