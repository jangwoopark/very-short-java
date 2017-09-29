//Final Exam
//Programmer Jang Woo Park
//CS 452 Fall 09'
//Due date Dec 15, 2009

import java.awt.*;
import java.util.Vector;

public class MadDialog extends Dialog
{
	private	TextField n1, n2, n3;
	private TextField a1, a2, a3, a4;
	private TextField v1, v2, v3;
	private TextField av1, av2;
	private TextField body;
	private TextField occupation;
	private TextField name, animal;
	private CheckboxGroup mfg;
	private Checkbox male, female;
	private CheckboxGroup mlg;
	private Checkbox most, least;
	private Choice color;
	private Choice time;
	private List prep;
	private TextArea text;
		
	public MadDialog(Frame owner)
	{
		super(owner, "Mad Dialog", true);
		setLayout(new FlowLayout());
		Panel nPanel = new Panel();
		nPanel.add(new Label("Nouns:"));
		n1 = new TextField(10);
		n2 = new TextField(10);
		n3 = new TextField(10);
		nPanel.add(n1);
		nPanel.add(n2);
		nPanel.add(n3);
		add(nPanel);

		Panel aPanel = new Panel();
		aPanel.add(new Label("Adjectives:"));
		a1 = new TextField(10);
		a2 = new TextField(10);
		a3 = new TextField(10);
		a4 = new TextField(10);
		aPanel.add(a1);
		aPanel.add(a2);
		aPanel.add(a3);
		aPanel.add(a4);
		add(aPanel);
				
		Panel vPanel = new Panel();
		vPanel.add(new Label("Verbs:"));
		v1 = new TextField(10);
		v2 = new TextField(10);
		v3 = new TextField(10);
		vPanel.add(v1);
		vPanel.add(v2);
		vPanel.add(v3);
		add(vPanel);

		Panel avPanel = new Panel();
		avPanel.add(new Label("Adverbs:"));
		av1 = new TextField(10);
		av2 = new TextField(10);
		avPanel.add(av1);
		avPanel.add(av2);
		add(avPanel);

		Panel boPanel = new Panel();
		boPanel.add(new Label("Body Part:"));
		body = new TextField(10);
		boPanel.add(body);

		boPanel.add(new Label("Occupation:"));
		occupation = new TextField(10);
		boPanel.add(occupation);
		add(boPanel);

		Panel naPanel = new Panel();
		naPanel.add(new Label("Name:"));
		name = new TextField(10);
		naPanel.add(name);
		naPanel.add(new Label("Animal:"));
		animal = new TextField(10);
		naPanel.add(animal);
		add(naPanel);
		
		Panel mfPanel = new Panel();
		mfPanel.add(new Label("Male or Female:"));
		mfg = new CheckboxGroup();
		add(mfPanel);
		male=new Checkbox("Male", true, mfg);
		add(male);
		female=new Checkbox("Female", true, mfg);
		add(female);

		Panel mlPanel = new Panel();
		mlPanel.add(new Label("Most or Least:"));
		mlg = new CheckboxGroup();
		add(mlPanel);
		most=new Checkbox("Most", mlg, true);
		add(most);
		least=new Checkbox("Least", mlg, true);
		add(least);
		
		Panel ctPanel = new Panel();
		ctPanel.add(new Label("Choose a color:"));
		color = new Choice();
		color.add("blue");
		color.add("red");
		color.add("yellow");
		color.add("green");
		color.add("orange");
		color.add("violet");
		ctPanel.add(color);
		ctPanel.add(new Label("Choose a timeframe:"));
		time = new Choice();
		time.add("now");
		time.add("later");
		time.add("tomorrow");
		time.add("yesterday");
		time.add("today");
		time.add("never");
		ctPanel.add(time);
		add(ctPanel);

		Panel ptPanel = new Panel();
		ptPanel.add(new Label("Prepositions:"));
		prep = new List(3, false);
		prep.add("of");
		prep.add("for");
		prep.add("by");
		prep.select(0);
		ptPanel.add(prep);
		ptPanel.add(new Label("Text:"));
		text = new TextArea("Enter a sentence or two here", 3, 20, TextArea.SCROLLBARS_NONE);
		ptPanel.add(text);
		add(ptPanel);
		
		setSize(1000, 400);
	}

	public String[] getStringArray(){
		Vector<String> v=new Vector<String>();
		v.add(a1.getText());
		v.add(n1.getText());
		v.add(a2.getText());
		v.add(name.getText());
		if(mlg.getSelectedCheckbox()==most)v.add("most"); else v.add("least");
		v.add(a3.getText());
		if(mfg.getSelectedCheckbox()==male)v.add("he"); else v.add("she");
		v.add(n2.getText());
		v.add(av1.getText());
		v.add(v2.getText());
		v.add(v3.getText());
		v.add(color.getSelectedItem());
		v.add(animal.getText());
		v.add(occupation.getText());
		v.add(text.getText());
		v.add(av2.getText());
		v.add(name.getText());
		if(mfg.getSelectedCheckbox()==female)v.add("her"); else v.add("him");
		v.add(time.getSelectedItem());
		v.add(av2.getText());
		v.add(v1.getText());
		v.add(body.getText());
		v.add(prep.getSelectedItem());
		v.add(n3.getText());
		v.add(a4.getText());
		v.add("");
		String[] strings =new String[v.size()];
		int i =0;
		  for(String str : v){
			  strings[i++] = str;
		  }
		return strings;
	}
}