/* MenuTest Demonstrates the MenuBar, Menu, and MenuItem classes */
import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuTest{
	public MenuTest(){
		//create MenuBar object
		MenuBar menuBar=new MenuBar();
		
		//create a Menu object
		Menu fileMenu=new Menu("File");
		
		//Create MenuItem objects
		MenuItem fm_new=new MenuItem("New");
		fm_new.setShortcut(new MenuShortcut(KeyEvent.VK_N));
		MenuItem fm_open=new MenuItem("Open");
		fm_open.setShortcut(new MenuShortcut(KeyEvent.VK_O));
		MenuItem fm_save=new MenuItem("Save");
		fm_save.setShortcut(new MenuShortcut(KeyEvent.VK_S));
		fm_save.setEnabled(false);
		MenuItem fm_saveAs=new MenuItem("Save As...");
		fm_saveAs.setShortcut(new MenuShortcut(KeyEvent.VK_A));
		fm_saveAs.setEnabled(false);		
		MenuItem fm_exit=new MenuItem("Exit");		
		
		//add the MenuItems to the Menu with a Separator
		fileMenu.add(fm_new);
		fileMenu.add(fm_open);
		fileMenu.add(fm_save);
		fileMenu.add(fm_saveAs);
		//separator
		fileMenu.addSeparator();
		fileMenu.add(fm_exit);
		
		//make another quick Menu
		Menu editMenu=new Menu("Edit");
		MenuItem em_options=new MenuItem("Options");
		editMenu.add(em_options);
		
		//add the Menus to the MenuBar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		//create the Frame and ad the MenuBar
		ComponentTestFrame frame=new ComponentTestFrame("Menu Test");
		frame.setMenuBar(menuBar);
		frame.setBackground(Color.white);
		frame.setVisible(true);
	}
	public static void main(String args[]){
		MenuTest mt=new MenuTest();
	}
}
			