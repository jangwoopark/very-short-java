/* Test 2
 * Programmer Jang Woo Park
 * Due date Nov 17, 2009
 */
public class doubleArray
{
	int[][] rowForm = new int[5][5];
	int[][] colForm = new int[5][5];

	void q1()
	{
		//#1
		int counting = 1;
		System.out.println("\n\nQ1 double array");
		int[][] rowForm = new int[5][5];
		for (int i = 0; i < 5; i++)
		{
			System.out.print("\n");
			for (int j = 0; j < 5; j++)
			{
				rowForm[i][j] = counting++;
				System.out.print(rowForm[i][j] + " ");
			}
		}
	}
	void q2()
	{
		int counting = 1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				rowForm[i][j] = counting++;
			}
		}
		//#2
		System.out.println("\n\nQ2 double array");
		int[][] colForm = new int[5][5];
		for (int k = 0; k < 5; k++)
		{
			System.out.print("\n");
			for (int l = 0; l < 5; l++)
			{
				colForm[k][l] = rowForm[l][k];
				System.out.print(colForm[k][l] + " ");
			}
		}
	}
	void q3()
	{
		int counting = 1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				rowForm[i][j] = counting++;
			}
		}
		for (int k = 0; k < 5; k++)
		{
			for (int l = 0; l < 5; l++)
			{
				colForm[k][l] = rowForm[l][k];
			}
		}
		//#3
		System.out.println("\n\nQ3 double array");
		int thirdRow = 0;
		for (int i = 0; i < 5; i++)
			thirdRow += rowForm[2][i];
		System.out.print("\nThe sum of the third row is "+thirdRow);
	}
	void q4()
	{
		int counting = 1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				rowForm[i][j] = counting++;
			}
		}
		for (int k = 0; k < 5; k++)
		{
			for (int l = 0; l < 5; l++)
			{
				colForm[k][l] = rowForm[l][k];
			}
		}
		//#4
		System.out.println("\n\nQ4 double array");
		int largest = 0;
		for (int i = 0; i < 4; i++)
			if (colForm[0][i] < colForm[0][i + 1])
				largest = colForm[0][i + 1];
		System.out.print("\nThe largest element in column 1 is "+largest);
	}
	void q5()
	{
		int counting = 1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				rowForm[i][j] = counting++;
			}
		}
		for (int k = 0; k < 5; k++)
		{
			for (int l = 0; l < 5; l++)
			{
				colForm[k][l] = rowForm[l][k];
			}
		}
		//#5
		System.out.println("\n\nQ5 double array");
		int[] column = new int[5];
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++)
				column[i] += colForm[i][j];
		for (int k = 0; k < 5; k++)
			System.out.printf("\nColumn %s = %s",k+1,column[k]);
	}
	void q6()
	{
		int counting = 1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				rowForm[i][j] = counting++;
			}
		}
		//#6
		System.out.println("\n\nQ6 double array");
		System.out.println("\nRow 2 added to row 3:");
		for (int i = 0; i < 5; i++)
		{
			rowForm[2][i] += rowForm[1][i];
			System.out.print(rowForm[2][i] + " ");
		}
		System.out.println("\n\nRow Array rebuilt:");
		for (int j = 0; j < 5; j++)
		{
			System.out.print("\n");
			for (int k = 0; k < 5; k++)
				System.out.print(rowForm[j][k] + " ");
		}
	}
	void q7()
	{
		int counting = 1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				rowForm[i][j] = counting++;
			}
		}
		for (int k = 0; k < 5; k++)
		{
			for (int l = 0; l < 5; l++)
			{
				colForm[k][l] = rowForm[l][k];
			}
		}
		//#7
		System.out.println("\n\nQ7 double array");
		System.out.println("\nInterchange column 3 with column 4");
		int temp[] = new int[5];
		for (int i = 0; i < 5; i++)
		{
			temp[i] = colForm[2][i];
			colForm[2][i] = colForm[3][i];
			colForm[3][i] = temp[i];
		}
		System.out.print("\nColumn 3 = ");
		for (int i = 0; i < 5; i++)
			System.out.print(colForm[2][i]);
		System.out.print("\nColumn 4 = ");
		for (int i = 0; i < 5; i++)
			System.out.print(colForm[3][i]);
		System.out.println("\n\nRow Array rebuilt:");
		for (int j = 0; j < 5; j++)
		{
			System.out.print("\n");
			for (int k = 0; k < 5; k++)
				System.out.print(colForm[j][k] + " ");
		}
	}
}

