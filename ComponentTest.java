/* ComponentTest
 * Shows a bunch of Components that don't do anything */
 
 import java.awt.*;
 
 public class ComponentTest extends ComponentTestFrame{
 	public ComponentTest(){
 		super("java.awt Components");
 		add(new Label("Label"));
 		add(new Button("Button"));
 		add(new TextField("TextField",8));
 		add(new Scrollbar(Scrollbar.VERTICAL,0,1,0,11){
 			public Dimension getPreferredSize(){
 				return new Dimension(15, 100);
 			}
 		});
 		
 		add(new Checkbox("Checkbox",true));
 		CheckboxGroup cg=new CheckboxGroup();
 		add(new Checkbox("Radio 1",true,cg));
  		add(new Checkbox("Radio 2",false,cg));
 		add(new Checkbox("Radio 3",false,cg));
 		Canvas c=new Canvas(){
 			public void paint(Graphics g){
 				g.drawString("Canvas",15,20);
 			}
 		};
 		c.setSize(75,30);
 		c.setBackground(Color.gray);
 		add(c);
 		Choice ch=new Choice();
 		ch.add("Choice");
 		ch.add("Moe");
  		ch.add("Larry");
 		ch.add("Curly");		  				
  		ch.add("Shemp");
  		add(ch);
  		List l=new List(5,true);
		l.add("Maine"); 
 		l.add("New Hampshire"); 
 		l.add("Vermont"); 
 		l.add("Massachusetts"); 
 		l.add("Rhode Island"); 
 		l.add("Connecticut"); 
 		add(l);
 		add(new TextArea("TextArea",10,40));
 	}
 	
 	public static void main(String args[]){
 		ComponentTest ct=new ComponentTest();
 		ct.setSize(315,435);
 		ct.setLocation(80,60);
 		ct.setVisible(true);
 	}
 }
 				  						