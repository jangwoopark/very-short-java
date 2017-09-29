/* Test 2
 * Programmer Jang Woo Park
 * Due date Nov 17, 2009
 */
public class singleArray
{
	void q1()
	{
		//#1
		System.out.println("Q1 one array");
		int A1[] ={ 1, 4, 9, 14, 25, 36, 49, 64, 81, 100 };
		for (int i = 0; i < A1.length; i++)
			System.out.print(A1[i] + " ");
		System.out.println();
	}
	void q2()
	{
		//#2
		System.out.println("\nQ2 one array");
		int A2[] ={ 1, 2 };
		int B2[] ={ 3, 4, 5 };
		int C2[] ={ 6 };
		System.out.print(A2[0]+" "+A2[1]+" "+B2[0]+" "+B2[1]+" "+B2[2]+" "+C2[0]);
		System.out.println();
	}
	void q3()
	{
		//#3
		System.out.println("\nQ3 one array");
		int A3[] ={ 1, 3, 7, 9, 11 };
		int B3[] ={ 1, 3, 9, 7, 11 };
		System.out.print(A3[0]+","+A3[1]+","+A3[2]+","+A3[3]+","+A3[4]+"\n");
		for (int j = 0; j < A3.length; j++)
			if (A3[j] == B3[j])
				System.out.print(B3[j] + ",");
			else
			{
				System.out.printf(B3[j] + "\nERROR OUT OF SEQUENCE = %h", A3[j]);
				break;
			}
		System.out.println();

	}
	void q4()
	{
		//#4
		System.out.println("\nQ4 one array");
		int A4[] ={ 1, 2, 3, 44, 5 };
		int B4[] ={ 1, 2, 6, 7, 8, 9, 11, 12 };
		int counter = 0;
		for (int i = 0; i < A4.length; i++)
			for (int j = 0; j < B4.length; j++)
				if (A4[i] == B4[j]) counter++;
		System.out.printf("THE NUMBER OF IDENTICAL ELEMENTS IS %h", counter);
		System.out.println();

	}
	void q5()
	{
		//#5
		System.out.println("\nQ5 one array");
		int even[] = new int[20];
		for (int i = 0; i < 20; i++)
			even[i] = i + 1;
		for (int j = 0; j < 20; j++)
			if (even[j] % 2 == 0)
				System.out.print(even[j] + ",");
		System.out.println();

	}
	void q6()
	{
		//#6
		System.out.println("\nQ6 one array");
		String tumtytum = "Tumtytum!";
		char[] letter = new char[9];
		int count = 0;
		do
		{
			letter[count] = tumtytum.charAt(count);
			count++;
		} while (letter[count - 1] != '!');
		System.out.println("\t Index value\t\t Indexed variable");
		for (int i = 0; i < letter.length; i++)
			System.out.print("\t\t" + i + "\t\t\t" + letter[i] + "\n");
		for (int j = 0; j < 70; j++)
			System.out.print("_");
		System.out.println("\n\n\t Index value\t\t Indexed variable");
		for (int k = letter.length - 1; k > -1; k--)
			System.out.print("\t\t" + k + "\t\t\t" + letter[k] + "\n");
		System.out.println();

	}
}


