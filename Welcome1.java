//Programmer: Jang Park
//Program: Welcome1.java

import javax.swing.JFrame;

public class Welcome1 extends JFrame
{
 public Welcome1()
 {
  createUserInterface();
 }
 private void createUserInterface()
 {
  setSize(100, 100);
  setVisible(true);
 }
 public static void main(String args[])
 {
  Welcome1 application=new Welcome1();
  application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
} 