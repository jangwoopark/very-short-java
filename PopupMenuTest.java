/* PopupMenuTest Demonstrates the PopupMenu Component
 */
 import java.awt.*;
 public class PopupMenuTest {
 	public PopupMenuTest() {
 		//create the PopupMenu
 		PopupMenu popMenu=new PopupMenu("Clipboard");
 		
 		//create the MenuItems
 		MenuItem pm_cut=new MenuItem("Cut");
  		MenuItem pm_copy=new MenuItem("Copy");
 		MenuItem pm_paste=new MenuItem("Paste");
 		MenuItem pm_delete=new MenuItem("Delete");	
 		
 		//add the MenuItems to the PopupMenu
 		popMenu.add(pm_cut);	
  		popMenu.add(pm_copy); 
 		popMenu.add(pm_paste);	
 		popMenu.add(pm_delete);	 		 
 		
 		//create the Frame and make show the PopupMenu
 		ComponentTestFrame frame=new ComponentTestFrame("PopupMenu Test");
 		frame.add(popMenu);
 		frame.setVisible(true);
 		popMenu.show(frame,50,50);
 	}
 	public static void main(String args[]){
 		PopupMenuTest pmt=new PopupMenuTest();
 	}
 } 		