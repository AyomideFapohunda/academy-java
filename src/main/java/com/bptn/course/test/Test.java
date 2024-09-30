package com.bptn.course.test;



public class Test {
	   public static void main(String[] args) {
		   
		   int inputNumber = 1200, reversedValue = 0;
		// FREEZE CODE END

		        int lastNumber;
		        while(inputNumber !=0){

		            lastNumber = inputNumber % 10;
		            reversedValue = reversedValue*10 + lastNumber;
		            inputNumber = inputNumber / 10;
	        }
		        System.out.println(reversedValue);
	}

}
