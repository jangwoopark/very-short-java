/*
 * TextAreaTest
 * Demonstrates the TextArea Component
 */

import java.awt.*;

public class TextAreaTest{
 public TextAreaTest(){
 //Make the TextAreas
 TextArea ta1 = new TextArea("", 10, 20);
 TextArea ta2 = new TextArea("TextArea\nText", 10, 10,
  TextArea.SCROLLBARS_NONE);
 ta2.setFont(new Font("Verdana", Font.ITALIC, 12));
 ta2.setForeground(Color.yellow);
 ta2.setBackground(Color.black);
 TextArea ta3 = new TextArea("This TextArea is not editable",
  10, 15, TextArea.SCROLLBARS_HORIZONTAL_ONLY);
 ta3.setEditable(false);
 TextArea ta4 = new TextArea("This TextArea is not enabled",
  4, 25, TextArea.SCROLLBARS_VERTICAL_ONLY);
 ta4.setEnabled(false);
 
 //Make the Frame and add the TextAreas to it
 ComponentTestFrame frame = new ComponentTestFrame("TextArea Test");
 frame.add(ta1);
 frame.add(ta2);
 frame.add(ta3);
 frame.add(ta4);
 frame.setVisible(true);
}

public static void main(String args[]){
 TextAreaTest tat = new TextAreaTest();
 }
}