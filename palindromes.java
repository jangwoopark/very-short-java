//palindromes.java ... check palindromes
//Programmer Jang Woo Park
//CS 452 Fall 2009
//Due Oct 27, 2009

import java.util.Scanner;
import java.util.StringTokenizer;

public class palindromes
{
	public static void main(String args[])	//main method header
	{
		int onemore=0;
		do
		{
			if (ask() == 0)	//if statement to decide if it is a palindrome or not
				System.out.println("It is a Palindrome!");
			else
				System.out.println("It is not a Palindrome!");
			Scanner again = new Scanner(System.in);
			System.out.print("Do you want to try again?\n1 for yes or 0 for no? ");
			onemore = again.nextInt();
		} while (onemore == 1);	//loop to ask to continue or not
	}	//end of main method
	static int ask()	//method to determine a palindrome
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input a word or phrase:\n");
		String palin = keyboard.nextLine();	//input word or phrase
		int npalin = palin.length();

		StringTokenizer st = new StringTokenizer(palin);
		int nst = st.countTokens();	//to tokenize word or phrase
		int counter = 0;	//used to determine if it is a palindrome

		if (nst == 1)	//if it is a word and compare characters
		{
			System.out.println("You input a word.");
			char palinArray[] = new char[npalin];
			for (int t = 0; t < npalin; t++)
				palinArray[t] = palin.charAt(t);
			for (int n = 0; n < npalin; n++)
				if (palinArray[n] == palinArray[npalin - 1 - n])
					System.out.println("It is a match!");
				else
				{
					System.out.println("It is not a match!");
					counter++;
				}
		}
		else
		{
			System.out.println("You input a phrase.");
			String wordCount[] = new String[nst];
			for (int r = 0; r < nst; r++)
				wordCount[r] = st.nextToken();	//get array of tokens
			char charWordCount[][] = new char[nst][npalin];	
			//double array of chars

			for (int m = 0; m < nst; m++)
				for (int w = 0; w < wordCount[m].length(); w++)
					charWordCount[m][w] = wordCount[m].charAt(w);
			//fill up the double array with tokens as char

			for (int p = 0; p < nst; p++)	//determine if each word match or not
				for (int q = 0; q < wordCount[p].length(); q++)
					if (charWordCount[nst - 1 - p][q] == charWordCount[p][q])
						System.out.println("It is a match");
					else
					{
						System.out.println("It is not a match");
						counter++;
					}
		}	//if it is a phrase compare words char by char
		return counter;
	}
}