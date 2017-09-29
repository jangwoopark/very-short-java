public class repeat
{
 public static void main(String args[])
 {
  int col;
  int row;
  int counter=1;
  for (row=1; row<=3; row++)
  {
   for (col=1; col<=4; col++)
   {
    System.out.printf("%d", counter);
	 counter++;
   }
	System.out.println();
  }
 } 
}