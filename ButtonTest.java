/*
 * ButtonTest
 * Demonstrates the Button Component
 */

import java.awt.*;

public class ButtonTest extends Frame {

 public ButtonTest() {
  //Make Buttons
  Button b1 = new Button("Button");
  Button b2 = new Button();
  b2.setLabel("Press me!");
  b2.setFont(new Font("Timesroman", Font.BOLD, 18));
  Button b3 = new Button("Can't press me");
  b3.setEnabled(false);
  Button b4 = new Button("Colors");
  b4.setForeground(Color.green);
  b4.setBackground(Color.black);

  //Make the Frame and add the buttons to it
  ComponentTestFrame frame = new ComponentTestFrame("Button Test");
  frame.add(b1);
  frame.add(b2);
  frame.add(b3);
  frame.add(b4);
  frame.setVisible(true);
 }

 public static void main(String args[]) {
  ButtonTest bt = new ButtonTest();
 }
}