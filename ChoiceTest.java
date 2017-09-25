/*
 * ChoiceTest
 * Demonstrate the Choice Component
 */
 
 import java.awt.*;
 
 public class ChoiceTest {
 
  public ChoiceTest() {
   //Make the Choices
	Choice c1 = new Choice();
	c1.add("Soup");
	c1.add("Salad");
	Choice c2 = new Choice();
	c2.add("Java");
	c2.add("C++");
	c2.add("HTML");
	c2.add("JavaScript");
	c2.add("COBOL");
	c2.add("FORTRAN");
	Choice c3 = new Choice();
	c3.add("One");
	c3.add("Two");
	c3.add("Three");
	c3.setForeground(Color.red);
	c3.setBackground(Color.black);
	c3.setFont(new Font("Courier", Font.PLAIN, 16));
	Choice c4 = new Choice();
	c4.add("Not Enabled");
	c4.add("Nope");
	c4.setEnabled(false);
	
	//Make the Frame and add the Choices to it
	ComponentTestFrame frame = new ComponentTestFrame("Choice Test");
	frame.add(c1);
	frame.add(c2);
	frame.add(c3);
	frame.add(c4);
	frame.setVisible(true);
  }
  
  public static void main(String args[]) {
   ChoiceTest ct = new ChoiceTest();
  }
 }