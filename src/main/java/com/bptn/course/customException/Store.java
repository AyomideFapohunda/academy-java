package com.bptn.course.customException;

import java.util.HashMap;
import java.util.Map;

	public class Store {
	    
	    // create the map instance variable
//	    private Map<String, Integer> products;
		HashMap<String, Integer> products = new HashMap<>();


	    public Store() {
	        // Initialize the products map with default values  
	          products = new HashMap<>();
	          products.put("apple", 10);  
	          products.put("banana", 5);  
	          products.put("orange", 0);   
	    }

	    public void purchase(String product, int quantity) throws OutOfStockException {
	        // Check if the product is available in the store. Hint: Use the map
	        if (products.containsKey(product)){
	          
	            // If not, throw an OutOfStockException with a message indicating the product is not available.
	            
	        }
	        else{
	          throw new OutOfStockException("Product " + product + " not available in store");
	        }

	        // Check if there is enough stock for the desired quantity. Hint: Use the map
	        //if(products.get(product)>quantity)--another way to write this;
	        int quantityAvailable = products.get(product);
	        if (quantityAvailable >= quantity){
	        }


	            // If not, throw an OutOfStockException with a message indicating the product is out of stock.  
	            else{
	          throw new OutOfStockException("Product " + product + " out of stock");
	        }  
	 }
}

