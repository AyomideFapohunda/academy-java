package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
		String greeting = "Hello";

	     // This code gets the class of the greeting object
	     Class currClass = greeting.getClass();
	     System.out.println(currClass);

	     // This code gets the parent class for the child class
	     Class parentClass = currClass.getSuperclass();
	     System.out.println(parentClass);
		
	}
}
