import java.util.Scanner;
public class GradeBookTest2
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  GradeBook2 myGradeBook2 = new GradeBook2();
  System.out.printf("Initial course name is: %s\n\n", myGradeBook2.getCourseName());
  System.out.println("Please enter the course name:");
  String theName = input.nextLine();
  myGradeBook2.setCourseName(theName);
  System.out.println();
  myGradeBook2.displayMessage();
 }
}