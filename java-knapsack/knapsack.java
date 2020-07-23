import java.util.Scanner;

public class Solution {

  private static int arrayLength;
  private static int targetValue;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numberOfTestCases = scanner.nextInt();

    while (numberOfTestCases-- > 0) {

      arrayLength = scanner.nextInt();
      targetValue = scanner.nextInt();
      int[] coinValues = new int[arrayLength];

      for (int i = 0; i < arrayLength; i++) {
        coinValues[i] = scanner.nextInt();
      }

      int result = find_maximumSumForTargetValue(coinValues);
      System.out.println(result);
    }
    scanner.close();
  }

  /**
   * Finds the maximum sum, closest to the target value, that can be created 
   * with the avaible coin values.
   * There is an unlimited number of coins for each coin value.
   * The maximum sum can not exceeds the target value.
   *
   * @return An integer, representing the maximum sum.
   */
  private static int find_maximumSumForTargetValue(int[] coinValues) {

    /** 
    * The array stores the possibilty to create each sum, up to the target value. 
    * If current sum (represented by the value of "i") can be created with
    * the available coin values, then possibleValues[i] = true. 
    * Othewise, possibleValues[i] = false.
    */
    boolean[] possibleValues = new boolean[targetValue + 1];
    possibleValues[0] = true;
    int sum_closestToTargetValue = 0;

    for (int i = 0; i < arrayLength; i++) {

      for (int j = coinValues[i]; j <= targetValue; j++) {
        if (!possibleValues[j] && possibleValues[j - coinValues[i]]) {
          possibleValues[j] = possibleValues[j - coinValues[i]];

          if (sum_closestToTargetValue < j) {
            sum_closestToTargetValue = j;
          }
        }
      }
    }

    return sum_closestToTargetValue;
  }
}
