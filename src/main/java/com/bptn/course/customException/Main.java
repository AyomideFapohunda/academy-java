package com.bptn.course.customException;

public class Main {

	public static void main(String[] args) {
		Store store = new Store();
	    try {
	        store.purchase("apple",11);
	        System.out.println("Purchase successful!");
	    } catch (OutOfStockException e) {
	        System.out.println(e.getMessage());
	    }
	}
}

