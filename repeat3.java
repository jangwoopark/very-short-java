public class repeat3
{
 public static void main(String args[])
 {
  int col;
  int row;
  int counter=1;
  for (row=1; row<=4; row++)
  {
   for (col=1; col<=row; col++)
   {
    System.out.printf("%d", counter);
	}
	 counter++;
	System.out.println();
  }
 } 
}