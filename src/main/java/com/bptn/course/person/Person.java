package com.bptn.course.person;

public class Person {
	// Create instance variables
		private String firstName;
		private String lastName;
		private int birthMonth;
		private int birthDay;
		private int birthYear;
		private String ssn;

	// Constructor to initialize class variables
	public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
		this.ssn = ssn;
	}

	// Create methods

	public String getFirstName(){ // returns the first name of the person
		return firstName;
		}

	public String getLastName(){ //returns the last name of the person
		return lastName;
		}

	public void setFirstName(String firstName){ //takes a string parameter firstName and sets it as the first name of the person
		this.firstName = firstName;
		}

	public void setLastName(String lastName){//takes a string oarameter lastName and sets it as the last name of the person
		this.lastName = lastName;
		}

	public String getBirthday(){//gets the birthday and returns a string representing the person's birthday
		return birthMonth + "/" + birthDay + "/" + birthYear;
		}

	public boolean verifySSN(String ssn){//takes a string parameter and returns a boolean indicating whether it matches the person's ssn or not
		return this.ssn.equals(ssn);
		}

	public static void main(String[] args) {
		 Person person1 = new Person("John", "Doe", 1, 1, 1990, "123-45-6789");
		 Person person2 = new Person("Jane", "Doe", 2, 2, 1991, "987-65-4321");
		 Person person3 = new Person("Jane", "Smith", 1, 1, 1990, "111-11-1111");
		 Person person4 = new Person("Jane", "Smith", 2, 2, 1991, "222-22-2222");
		            
		 System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() + " Birthday: " + person1.getBirthday() + " SSN: " + person1.verifySSN("123-45-6789"));
		 System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() + " Birthday: " + person2.getBirthday() + " SSN: " + person2.verifySSN("987-65-4321"));
		 System.out.println("Person 3: " + person3.getFirstName() + " " + person3.getLastName() + " Birthday: " + person3.getBirthday() + " SSN: " + person3.verifySSN("111-11-1111"));
		 System.out.println("Person 4: " + person4.getFirstName() + " " + person4.getLastName() + " Birthday: " + person4.getBirthday() + " SSN: " + person4.verifySSN("222-22-2222"));
		 }
	}
