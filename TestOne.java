//Test 1
//CS 452 Fall 2009
//Programmer Jang Woo Park
//Due Tuesday Sept 29, 2009

import java.util.Scanner;											//retrieve Scanner

public class TestOne													//function header for class TestOne
{
 public static void main(String args[])						//start of main method
 {
  Scanner input = new Scanner(System.in);						//creat an object to input from keyboard
  
  OnTheSide theSide = new OnTheSide();							//creat an object to set, and display
  
  System.out.print("Please enter Name of employee: ");	//input and set the name
  String theName = input.nextLine();
  theSide.setEmployeeName(theName);

  System.out.print("Please enter the Hours worked: ");	//input and set the hours worked
  double thehours = input.nextDouble();
  theSide.setHoursWorked(thehours);

  System.out.print("Please enter the Hourly Rate: ");		//input and set the hourly rate
  double theRate = input.nextDouble();
  theSide.setHourlyRate(theRate);

  System.out.println();												//a line space for clarity

  theSide.displayName();											//display the name
  theSide.displayHours();											//display the hours worked
  theSide.displayRate();											//display the hourly rate
  theSide.displayPay();												//display the gross pay accordingly
  }
}