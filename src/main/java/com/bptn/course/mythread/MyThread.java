package com.bptn.course.mythread;

public class MyThread extends Thread {
	int limitToStop;

    // Create a constructor to initialize the above instance variable
    public MyThread(int limitToStop){
      this.limitToStop = limitToStop;
    }

    // Override the run() method here.
    @Override
    public void run(){
      for(int i = 0; i <= limitToStop; i++){
        if ( i % 2 != 0){ //Check if the number is odd
          System.out.println(i); //Prints Odd number
        }
        try {
          Thread.sleep(1000); // Sleep for 1 second to control the printing rate
        } catch (InterruptedException e){
          e.printStackTrace();//Handles potential interruptions
        }
      }

    }


}
