/*
 * ScrollbarTest
 * Demonstrates the Scrollbar Component
 */

import java.awt.*;

public class ScrollbarTest extends Scrollbar {

 public ScrollbarTest(int orientation, int value, int visible,
                      int minimum, int maximum){
  super(orientation, value, visible, minimum, maximum);
 }
 
 public Dimension getPreferredSize() {
  //Do this so FlowLayout won't resize the Scrollbar
  return getSize();
 }
 
 public static void main(String args[]) {
  //Create the Scrollbars
  ScrollbarTest sbt1 = new ScrollbarTest(Scrollbar.HORIZONTAL,
                                         50, 20, 0, 100);
  sbt1.setSize(200, 15);
  ScrollbarTest sbt2 = new ScrollbarTest(Scrollbar.VERTICAL,
                                         0, 7, 0, 10);
  sbt2.setSize(50, 200);

  //add the Scrollbars to the Frame
  ComponentTestFrame ctf = new ComponentTestFrame("Scrollbar Test");
  ctf.add(new Label(String.valueOf(sbt1.getMinimum()), Label.RIGHT));
  ctf.add(sbt1);
  ctf.add(new Label(String.valueOf(sbt1.getMaximum()
                                   - sbt1.getVisibleAmount())));
  ctf.add(sbt2);
  ctf.setVisible(true);
  }
 }