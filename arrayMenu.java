/* Test 2
 * Programmer Jang Woo Park
 * Due date Nov 17, 2009
 */
import java.util.Scanner;					//retrieve Scanner

public class arrayMenu
{
	public static void main(String args[])
	{
		singleArray sArray = new singleArray();
		sArray.q1();
		sArray.q2();
		sArray.q3();
		sArray.q4();
		sArray.q5();
		sArray.q6();
		doubleArray dArray = new doubleArray();
		dArray.q1();
		dArray.q2();
		dArray.q3();
		dArray.q4();
		dArray.q5();
		dArray.q6();
		dArray.q7();
		System.out.println();
		System.out.print("\nWould you like to choose one of the 13 questions? y or n? ");
		Scanner input = new Scanner(System.in);
		String theyorn = input.nextLine();
		char yorn = theyorn.charAt(0);
		if (yorn == 'y')
		{
			int theq;
			Scanner in = new Scanner(System.in);
			while (yorn == 'y')
			{
				System.out.print("\nPlease input a Q number from 1-13: ");
				theq = input.nextInt();
				switch (theq)
				{
					case 1: sArray.q1(); break;
					case 2: sArray.q2(); break;
					case 3: sArray.q3(); break;
					case 4: sArray.q4(); break;
					case 5: sArray.q5(); break;
					case 6: sArray.q6(); break;
					case 7: dArray.q1(); break;
					case 8: dArray.q2(); break;
					case 9: dArray.q3(); break;
					case 10: dArray.q4(); break;
					case 11: dArray.q5(); break;
					case 12: dArray.q6(); break;
					case 13: dArray.q7(); break;
				}
				System.out.print("\n\nDo you want to continue? y or n? ");
				theyorn = in.nextLine();
				yorn = theyorn.charAt(0);
			};
		}
		else ;
	}
}
