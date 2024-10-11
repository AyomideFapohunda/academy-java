package com.bptn.course.mapdemo;

import java.util.HashMap;
import java.util.Map;

//public class MapDemo {
//    public static void main(String[] args) {
//        Map<Integer, String> numbers = new HashMap<>();
//
//        // Add key-value pairs to the map
//        numbers.put(1, "one");
//        numbers.put(2, "two");
//        numbers.put(3, "three");
//        numbers.put(4, "four");
//        numbers.put(5, "five");
//        numbers.put(6, "six");
//        numbers.put(7, "seven");
//        numbers.put(8, "eight");
//        numbers.put(9, "nine");
//        numbers.put(10, "ten");
//
//        // Print the map
//        System.out.println("Original map: " + numbers);
//
//        // Remove the entry for key 7
//        numbers.remove(7);
//
//        // Add a new entry for key 11
//        numbers.put(11, "eleven");
//
//        // Print the updated map
//        System.out.println("Updated map: " + numbers);
//    }
//}


public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();

        // Add key-value pairs to the map
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");

        // Print the map in the desired format
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Remove the entry for key 7
        numbers.remove(7);

        // Add a new entry for key 11
        numbers.put(11, "eleven");

        // Print the updated map in the desired format
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}