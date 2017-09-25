/*
 * ListTest
 * Demonstrates the List Component
 */
 import java.awt.*;
 public class ListTest{
 	public ListTest(){
 		//Make the Lists
 		List l1=new List();
 		l1.add("Soup");
 		l1.add("Salad");
 		List l2=new List(6,true);
 		l2.add("Java");
 		l2.add("C++");
 		l2.add("HTML");
 		l2.add("JavaScript");
 		l2.add("COBOL");
 		l2.add("FORTRAN");
 		List l3=new List(5,false);
 		l3.add("One");
 		l3.add("Two");
 		l3.add("Three");
 		l3.add("Four");
 		l3.add("Five");
 		l3.add("Six");
 		l3.add("Seven");
 		l3.add("Eight");
 		l3.add("Nine");
 		l3.add("Ten");
 		l3.select(9);
 		l3.setForeground(Color.red);
 		l3.setBackground(Color.black);
 		l3.setFont(new Font("Courier",Font.PLAIN, 16));
 		
 		List l4=new List();
 		l4.add("Not Enabled");
 		l4.add("Nope");
 		l4.select(1);
 		l4.setEnabled(false);
 		
 		//Make the Frame and add Lists to it
 		ComponentTestFrame frame=new ComponentTestFrame("List Test");
 		frame.add(l1);
 		frame.add(l2);
 		frame.add(l3);
 		frame.add(l4);
 		frame.setVisible(true);
 	}
 	public static void main(String args[]){
 		ListTest lt=new ListTest();
 	}
 }