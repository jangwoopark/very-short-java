/*
 *CanvasTest Demonstrates the Canvas Component
 */
 import java.awt.*;
 public class CanvasTest extends Canvas{
 	public static void main(String args[]){
 		//Make the Canvas
 		CanvasTest c1=new CanvasTest();
 		c1.setSize(100,100);
 		
 		CanvasTest c2=new CanvasTest();
 		c2.setSize(100,100);
 		c2.setBackground(Color.orange);
 		c2.setForeground(Color.blue);
 		
  		CanvasTest c3=new CanvasTest();
 		c3.setSize(200,50);
 		c3.setBackground(Color.white);
 		c3.setForeground(Color.lightGray);
 
  		CanvasTest c4=new CanvasTest();
 		c4.setSize(80,150);
 		c4.setBackground(Color.darkGray);
 		c4.setForeground(Color.white);
 		
 		//Make the Frame and add the Canvas
 		ComponentTestFrame frame=new ComponentTestFrame("Canvas Test");
 		frame.add(c1);
  		frame.add(c2);
  		frame.add(c3);	
 		frame.add(c4);
 		frame.setVisible(true); 
 	}
 	/* Override the paint() method to alter its graphics */
 	public void paint(Graphics g){
 		g.setFont(new Font("Arial", Font.ITALIC+Font.BOLD, 16));
 		g.drawString("Canvas",15,25);
 	}
 }
 		 		