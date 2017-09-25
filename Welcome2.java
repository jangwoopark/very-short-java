// Programmer: Jang Park
// This is the second program
// Program: Welcome2.java with Javaguy.png image

import java.awt.*;
import javax.swing.*;

public class Welcome2 extends JFrame
{
 private JLabel textJLabel;
 private JLabel pictureJLabel;

 public Welcome2()
 {
	 createUserInterface();
 }

 private void createUserInterface()
 {
  Container contentPane = getContentPane();

  contentPane.setBackground(Color.YELLOW);
   contentPane.setLayout(null);
    textJLabel = new JLabel();

  textJLabel.setText("Welcome to Java Programming!");
  textJLabel.setLocation(35,0);
  textJLabel.setSize(550,88);
  textJLabel.setFont(new Font("SansSerif", Font.PLAIN, 36));
  textJLabel.setHorizontalAlignment(JLabel.CENTER);

   contentPane.add(textJLabel);
    pictureJLabel = new JLabel();
    pictureJLabel.setIcon(new ImageIcon("Javaguy.png"));
    pictureJLabel.setBounds(54,120,500,250);
    pictureJLabel.setHorizontalAlignment(JLabel.CENTER);

     contentPane.add(pictureJLabel);

    setTitle("Welcome");

    setSize(608,413);
    setVisible(true);
 }

 public static void main(String[] args)
 {
  Welcome2 application = new Welcome2();
  application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
} 