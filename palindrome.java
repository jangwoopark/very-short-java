//palindrome.java ... check palindromes
//Programmer Jang Woo Park
//CS 452 Fall 2009
//Due Oct 27, 2009

import java.util.Scanner;
import java.util.StringTokenizer;

public class palindrome{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input a word or phrase:\n");
		String palin = keyboard.nextLine();
				
		StringTokenizer st = new StringTokenizer(palin);
		int nst = st.countTokens();
		if (nst==1)
		System.out.println("You input a word.");
		else System.out.println("You input a phrase.");
		int npalin = palin.length();
		if (nst==1){
			char palinArray[]= new char[npalin];
				for (int t=0; t<npalin; t++)
				palinArray[t]=palin.charAt(t);
				for (int n=0; n<npalin; n++)
					if (palinArray[n]==palinArray[npalin-1-n])
					System.out.println("It is a match!");
					else
					System.out.println("It is not a match!");

		}
		else{
			String wordCount[] = new String[nst];
			for (int r=0;r<nst;r++)
			wordCount[r]=st.nextToken();
			char charWordCount[][] = new char[nst][npalin];
			
			for (int m=0; m<nst; m++)
			for (int w=0; w<wordCount[m].length(); w++)
			charWordCount[m][w]=wordCount[m].charAt(w);
			
			for (int p=0; p<nst; p++)
			for (int q=0; q<wordCount[p].length(); q++)
			{
			if (charWordCount[nst-1-p][q]==charWordCount[p][q])
			System.out.println("It is a match");
			else
			System.out.println("It is not a match");
			}
		}
	}
}