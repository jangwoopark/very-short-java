/*
 * PanelTest Demonstrates the Panel Component
 */
 import java.awt.*;
 public class PanelTest{
 	 public PanelTest(){
 	 	//Create the Panels and add components to them
 	 	Panel p1=new Panel();
 		p1.setBackground(Color.red);
 		p1.add(new Label("URL:",Label.RIGHT));
	 	p1.add(new TextField(25));
 		p1.add(new Button("Go"));
 	
	 	Panel p2=new Panel();
 		p2.setBackground(Color.darkGray);
	 	p2.setForeground(Color.white);
 		CheckboxGroup cbg=new CheckboxGroup();
	 	p2.add(new Label("Pick one:"));
 		p2.add(new Checkbox("Lead Guitar", false, cbg));
 		p2.add(new Checkbox("Bass Guitar", false, cbg));
 		p2.add(new Checkbox("Drums", false, cbg));
 		p2.add(new Button("OK"));
 		p2.setSize(100,500);
 		
 		ComponentTestFrame frame=new ComponentTestFrame("Panel Test");
 		frame.add(p1);
  		frame.add(p2);		
  		frame.setVisible(true);
 	 }
 	 public static void main(String args[]){
 	 	PanelTest pt=new PanelTest();
 	 }
 }