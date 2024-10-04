package com.bptn.course.employee;

public class Employee {
	 // Instance variable to store salary
	  private int salary;
	  private int hoursPerDay;
	   
	   // Instance variable to store hours per day worked by employee
	   public Employee(int salary, int hoursPerDay){
	      setSalary(salary);
	      sethoursPerDay(hoursPerDay);
	   }

	   // Constructor to set instance variable (salary) value 
	   public void setSalary (int salary){
	      if (salary < 500){
	         this.salary = salary + 10;
	      }else {
	         this.salary = salary;
	      }
	   }
	   
	    // Constructor to set instance variable (hoursPerDay) value 
	   public void sethoursPerDay(int hoursPerDay){
	      if (hoursPerDay > 6){
	         this.salary = salary + 5; 
	      } else{
	         this.salary = salary;
	      }
	   }

	   public int getSalary(){
	      return salary;
	   }
}



