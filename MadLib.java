//Final Exam
//Programmer Jang Woo Park
//CS 452 Fall 09'
//Due date Dec 15, 2009

import java.awt.*;
import java.awt.event.*;

public class MadLib extends Frame implements WindowListener
{
	private TextArea display;
	private MadDialog dialog;
	
	public MadLib()
	{
		super("MabLib");
		setBackground(SystemColor.control);
		setSize(400, 300);
		setFont(new Font("Courier", Font.PLAIN, 16));
		addWindowListener(this);
		setLayout(new FlowLayout());
		setLocation(100, 100);
		pack();
		dialog = new MadDialog(this);
		dialog.addWindowListener(this);
		dialog.setLocation(150, 150);
		dialog.setVisible(true);
	}
	public static void main(String args[])
	{
		MadLib ml = new MadLib();

	}
	public void buildStory()
	{
		String story = "";
		String[] segs ={"One fine "," night,a "," named "," ",
			" had a dream.\nIt was the "," "," dream since ",
			" dreamt that a "," "," "," and "," on a "," ",
			".\nIn this dream, an old "," said to him, \"","\" ",
			" "," interpreted this as a sign.\nTo ",", it meant, "," ",
			" "," your "," "," a "," when the moon is ","."};
		String[] s=dialog.getStringArray();
		for (int i = 0; i < s.length; i++)
			story+= (segs[i] + s[i]);
		MadDialog2 r=new MadDialog2(story);
	}
	public void windowClosing(WindowEvent e)
	{
		if (e.getSource() == this)
		{
			dispose();
			System.exit(0);
		}
		else if (e.getSource() instanceof Dialog)
		{
			buildStory();
			((Dialog)e.getSource()).setVisible(false);
		}

	}
	public void windowActivated(WindowEvent e) { }
	public void windowClosed(WindowEvent e) { }
	public void windowIconified(WindowEvent e) { }
	public void windowDeiconified(WindowEvent e) { }
	public void windowDeactivated(WindowEvent e) { }
	public void windowOpened(WindowEvent e) { }
}