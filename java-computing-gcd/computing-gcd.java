import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt(), y = s.nextInt();
    s.close();
    System.out.println(gcd(x, y));
  }

  public static int gcd(int x, int y) {
    return y == 0 ? x : gcd(y, x % y);
  }
}
