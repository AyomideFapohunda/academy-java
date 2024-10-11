package com.bptn.course.customException;

public class OutOfStockException extends Exception {
    
    // Modify the constructor below to take a String message parameter.   
    public OutOfStockException(String message) {
        // Call the superclass constructor passing the message parameter.
        super(message);
    }
}

