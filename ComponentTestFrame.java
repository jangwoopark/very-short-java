/*
 * ComponentTestFrame
 * A Simple Frame to use for testing components
 */

import java.awt.*;
import java.awt.event.*;

public class ComponentTestFrame extends Frame 
                                implements WindowListener {

  public ComponentTestFrame(String title) {
    super(title);
    setBackground(SystemColor.control);
    setSize(400, 300);
    setLocation(200, 150);
    setLayout(new FlowLayout());
    addWindowListener(this);
  }

  // the only WindowListener method I care about
  public void windowClosing(WindowEvent e) {
    dispose();
    System.exit(0);
  }

  // the rest of them that must be declared
  public void windowActivated(WindowEvent e) { }
  public void windowClosed(WindowEvent e) { }
  public void windowIconified(WindowEvent e) { }
  public void windowDeiconified(WindowEvent e) { }
  public void windowDeactivated(WindowEvent e) { }
  public void windowOpened(WindowEvent e) { }

}
