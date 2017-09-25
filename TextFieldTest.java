/*
 * TextFieldTest
 * Demonstrates the TextField Component
 */
 import java.awt.*;
 public class TextFieldTest{
 	public TextFieldTest(){
 		//Make the TextFields
 		TextField tf1=new TextField();
 		TextField tf2=new TextField(25);
 		tf2.setText("Type stuff here");
 		tf2.setFont(new Font("Timesroman",Font.BOLD,18));
 		TextField tf3=new TextField("I am disabled",15);
 		tf3.setEnabled(false);
 		TextField tf4=new TextField("Colors");
 		tf4.setForeground(Color.green);
 		tf4.setBackground(Color.black);
 		TextField tf5=new TextField("Not editable");
 		tf5.setEditable(false);
 		TextField tf6=new TextField("I am selected text!!!");
 		tf6.select(5,13);
 		TextField tf7=new TextField("Caret Here--><--");
 		TextField tf8=new TextField("username",8);
 		TextField tf9=new TextField("password",8);
 		tf9.setEchoChar('*');
 		
 		//Make the Frame and add the TextField to it
 		ComponentTestFrame frame=new ComponentTestFrame("TextField");
 		frame.add(tf1);
  		frame.add(tf2);
  		frame.add(tf3);
  		frame.add(tf4);
  		frame.add(tf5);
  		frame.add(tf6);
  		frame.add(tf7);
  		frame.add(tf8);
  		frame.add(tf9);
  		frame.setVisible(true);
  		tf7.setCaretPosition(14);
 	}
 	public static void main(String args[]){
 		TextFieldTest tft=new TextFieldTest();
 	}
 }
 		 		 		 		 		 		 		 		 		