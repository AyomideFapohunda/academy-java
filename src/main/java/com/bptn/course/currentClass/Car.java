package com.bptn.course.currentClass;

public class Car {
	String color;
	String brand;
	int price;
	
	Car(String color, String brand, int price){
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	public void printCarDetails() {
		System.out.println("Color: " + color);
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
	}
	
	public class Main {
		public static void main(String args[]) {
			Car car1 = new Car("white", "BMW", 70000);
			Car car2 = new Car("Red", "Audi", 80000);
	        car1.printCarDetails();
	        car2.printCarDetails();
		}
	}

}
