/*
 * CheckBox Test
 * Demonstrates the CheckBox Component
 */
 
 import java.awt.*;
 
 public class CheckboxTest {
 
  public CheckboxTest() {
   //Make the Checkboxes
	Checkbox cb1 = new Checkbox("Peppers");
	Checkbox cb2 = new Checkbox("Onions");
	Checkbox cb3 = new Checkbox("Celery");
	Checkbox cb4 = new Checkbox("Garlic", true);
	cb4.setEnabled(false);
	Checkbox cb5 = new Checkbox("Tomatoes");
	Checkbox cb6 = new Checkbox("Salt", true);
	Checkbox cb7 = new Checkbox("Pepper", false);
	Checkbox cb8 = new Checkbox();
	cb8.setLabel("Sugar");
	cb8.setState(false);
	cb8.setEnabled(false);
	
	//Make the Frame and add the Checkboxes to it
	ComponentTestFrame frame = new ComponentTestFrame("Checkbox Test");
	frame.add(cb1);
	frame.add(cb2);
	frame.add(cb3);
	frame.add(cb4);
	frame.add(cb5);
	frame.add(cb6);
	frame.add(cb7);
	frame.add(cb8);
	frame.setVisible(true);
  }
  public static void main(String args[]) {
   CheckboxTest cbt = new CheckboxTest();
  }
 }
