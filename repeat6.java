public class repeat6
{
 public static void main(String args[])
 {
  int col;
  int row;
  int counter=5;
  for (row=5; row>=1; row--)
  {
   for (col=1; col<=row; col++)
   {
    System.out.printf("%d", counter);
	}	
	counter--;
	System.out.println();
  }
 } 
}