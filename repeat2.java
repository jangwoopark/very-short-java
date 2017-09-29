public class repeat2
{
 public static void main(String args[])
 {
  int col;
  int row;
  int counter=5;
  for (row=1; row<=3; row++)
  {
   for (col=1; col<=row; col++)
   {
    System.out.printf("%d", counter);
	 counter++;
   }
	System.out.println();
  }
 } 
}