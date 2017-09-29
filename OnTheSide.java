//Test 1
//CS 452 Fall 2009
//Programmer Jang Woo Park
//Due Tuesday Sept 29, 2009

public class OnTheSide														//function header for class OnTheSide
{
 private String employeeName;												//instance variable for name
 private double hoursWorked;												//instance variable for hours worked
 private double hourlyRate;												//instance variable for hourly rate
 
 
 public void setEmployeeName(String name)								//set function for name
 {
  employeeName = name;
 }
 public String getemployeeName()											//get function for name
 {
  return employeeName;
 }
 public void displayName()													//display function for name
 {
  System.out.printf("Employee Name:\t\t%s\n", getemployeeName());
 }
 
 
 public void setHoursWorked(double hours)								//set function for hours worked
 {
  hoursWorked = hours;
 }
 public double getHoursworked()											//get function for hours worked
 {
  return hoursWorked;
 }
 public void displayHours()												//display function for hours worked
 {
  System.out.printf("Hours Worked:\t\t%s\n", getHoursworked());
 }


 public void setHourlyRate(double rate)								//set function for hourly rate
 {
  hourlyRate = rate;
 }
 public double getHourlyRate()											//get function for hourly rate
 {
  return hourlyRate;
 }
 public void displayRate()													//display function for hourly rate
 {
  System.out.printf("Hourly Rate:\t\t%s\n", getHourlyRate());
 }


 public void displayPay()													//display function for gross pay
 {
  if (hoursWorked <= 40)													//calculations for up to 40 hours
  {
   double grossPay = hoursWorked * hourlyRate;
   System.out.printf("Gross Pay:\t\t%s\n", grossPay);
  }
  else																			//calculations for beyond 40 hours
  {
   double grossPayOver = 40 * hourlyRate + (hoursWorked - 40) * 1.5 * hourlyRate;
   System.out.printf("Gross Pay:\t\t%s\n", grossPayOver);
  }
 }
}