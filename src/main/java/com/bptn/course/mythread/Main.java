package com.bptn.course.mythread;

public class Main {

	public static void main(String[] args) {
		 // Create a variable from the MyThread class here.
        MyThread thread = new MyThread(20);

        // Start the thread here
        thread.start();

	}

}
