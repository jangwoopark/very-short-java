//Final Exam
//Programmer Jang Woo Park
//CS 452 Fall 09'
//Due date Dec 15, 2009

import java.awt.*;
import javax.swing.*;

public class MadDialog2 extends JFrame
{
private JTextArea textJTextArea;
public MadDialog2(String result)
{
	createUserInterface(result);
}
private void createUserInterface(String fin)
{
	Container contentPane = getContentPane();

	contentPane.setLayout(null);
    textJTextArea = new JTextArea();
	textJTextArea.setText(fin);
	textJTextArea.setLocation(10,10);
	textJTextArea.setSize(970,245);
	textJTextArea.setFont(new Font("Courier", Font.PLAIN, 14));
	contentPane.add(textJTextArea);
	setTitle("Voila!");
	setLocation(100,100);
    setSize(1000,300);
    setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}