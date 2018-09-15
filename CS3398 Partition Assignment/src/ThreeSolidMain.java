package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;

// This file exemplifies the Open Close Principle in that it only calls the manager class and thus extending the functionality
// of the manager class can be done separately from main driver file. 

// The Single Responsiblity principle is maintained by this file because it is only responsible outputting a set of information
// given a provided input. It has no other reason to change at this time.

// The interface-segregation principle (ISP) is not relevant for the main file at this time as it is not depending upon any
// of the methods specified by the interface file IWorker.java. 



public class ThreeSolidMain
{   
	
   //Declaring objecs for each class
   public static Robot R2D2 = new Robot();
   public static TempWorker coffeeFetcher = new TempWorker();
   public static Worker janeDoe = new Worker();
   public static SuperWorker danTheMan = new SuperWorker();
   public static Manager tsManager = new Manager();

   // The entry main() method
   public static void main(String[] args) 
   {
	  //Running through the methods of each class
	  R2D2.work();
	  R2D2.reboot();
	  
	  janeDoe.work();
	  janeDoe.eat();
	  janeDoe.sick();
	  
	  coffeeFetcher.work();
	  coffeeFetcher.eat();
	  coffeeFetcher.sick();
	  
	  danTheMan.work();
	  danTheMan.eat();
	  danTheMan.sick();
	  
	  tsManager.schedulework();
	  tsManager.defineproduct();

      try 
      {
         System.out.format("Starting ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

            try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }

  



