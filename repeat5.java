public class repeat5
{
 public static void main(String args[])
 {
  int col;
  int row;
  int counter=9;
  for (row=3; row>=1; row--)
  {
   for (col=1; col<=row; col++)
   {
    System.out.printf("%d", counter);
	 counter--;
	}
	System.out.println();
  }
 } 
}