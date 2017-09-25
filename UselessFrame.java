/*
 * UselessFrame
 * A Frame that does absolutely nothing aside form merely existing
 */
 
 import java.awt.Frame;
 
 public class UselessFrame extends Frame{
 	public UselessFrame(){
 		super("Useless Frame");
 		setSize(300, 200);
 		setVisible(true);
 	}
 	public static void main(String args[]){
 		UselessFrame uf = new UselessFrame();
 	}
 }