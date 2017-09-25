/*
 * CheckBoxGroup Test
 * Demonstrates the CheckBoxGroup Component
 */
 
 import java.awt.*;
 
 public class CheckboxGroupTest {
 
  public CheckboxGroupTest() {
   //Make the Checkboxes
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox cb1 = new Checkbox("Red", false, cbg);
	Checkbox cb2 = new Checkbox("Green", false, cbg);
	Checkbox cb3 = new Checkbox("Blue", false, cbg);
	Checkbox cb4 = new Checkbox("Yellow", true, cbg);
	cb4.setEnabled(false);
	Checkbox cb5 = new Checkbox("Orange", false, cbg);
	Checkbox cb6 = new Checkbox("Purple", false, cbg);
	Checkbox cb7 = new Checkbox("Cyan", false, cbg);
	Checkbox cb8 = new Checkbox("Magenta", false, cbg);
	
	//Make the Frame and add the Checkboxes to it
	ComponentTestFrame frame = new ComponentTestFrame("CheckboxGroup Test");
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
   CheckboxGroupTest cbgt = new CheckboxGroupTest();
  }
 }
