import java.util.Arrays;
import java.util.Scanner;
  
public class Solution {
  private static int startLength;
  private static int endIndex_startLength;
  private static int change_startLength;
  private static final int maxIncrease_startLength = 2;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int total_testCases = scanner.nextInt();

    while (total_testCases-- > 0) {
      change_startLength = 0;
      startLength = scanner.nextInt();
      endIndex_startLength = startLength - 1;
      long[] input = new long[startLength + maxIncrease_startLength];

      for (int i = 0; i < startLength; i++) {
        input[i] = scanner.nextLong();
      }
      long[] result = calculate_smallestBinary_greaterThanInput_sameTotalBitsOfOne(input);
      printResults(result);
    }
    scanner.close();
  }

  private static void printResults(long[] result) {
    int newLength = startLength + change_startLength;
    System.out.println(newLength);

    for (int i = 0; i < newLength; i++) {
      String space = (i < newLength - 1) ? (" ") : ("\n");
      System.out.print(result[i] + space);
    }
  }

  private static long[] calculate_smallestBinary_greaterThanInput_sameTotalBitsOfOne(long[] input) {
    if (startLength == 1) {
      return startLength_isOne(input);
    }

    if (startLength == 2) {
      return startLength_isTwo(input);
    }

    if (startLength % 2 != 0 && startLength > 2) {
      return startLength_isOdd_and_isGreaterThanTwo(input);
    }

    if (startLength % 2 == 0 && startLength > 3) {
      return startLength_isEven_and_isGreaterThanThree(input);
    }

    return input;
  }

  private static long[] startLength_isOne(long[] input) {
    if (input[endIndex_startLength] == 1) {
      change_startLength = 1;
      input[endIndex_startLength + 1] = 1;
      return input;
    }

    if (input[endIndex_startLength] > 1) {
      change_startLength = 2;
      input[endIndex_startLength + 2] = input[endIndex_startLength] - 1;
      input[endIndex_startLength + 1] = 1;
      input[endIndex_startLength] = 1;
    }

    return input;
  }

  private static long[] startLength_isTwo(long[] input) {
    if (input[endIndex_startLength - 1] == 1) {
      input[endIndex_startLength]++;
      return input;
    }

    if (input[endIndex_startLength - 1] > 1) {
      change_startLength = 1;
      input[endIndex_startLength + 1] = input[endIndex_startLength - 1] - 1;
      input[endIndex_startLength]++;
      input[endIndex_startLength - 1] = 1;
    }

    return input;
  }

  private static long[] startLength_isOdd_and_isGreaterThanTwo(long[] input) {
    if (input[endIndex_startLength] == 1 && input[endIndex_startLength - 1] == 1) {
      change_startLength = -1;
      input[endIndex_startLength] = 0;
      input[endIndex_startLength - 1] = 1;
      input[endIndex_startLength - 2]++;
      return input;
    }

    if (input[endIndex_startLength] > 1 && input[endIndex_startLength - 1] == 1) {
      input[endIndex_startLength]--;
      input[endIndex_startLength - 2]++;
      return input;
    }

    if (input[endIndex_startLength] == 1 && input[endIndex_startLength - 1] > 1) {
      change_startLength = 1;
      input[endIndex_startLength + 1] = 1;
      input[endIndex_startLength - 1]--;
      return input;
    }

    if (input[endIndex_startLength] > 1 && input[endIndex_startLength - 1] > 1) {
      change_startLength = 2;
      input[endIndex_startLength + 2] = input[endIndex_startLength] - 1;
      input[endIndex_startLength + 1] = 1;
      input[endIndex_startLength] = 1;
      input[endIndex_startLength - 1]--;
    }

    return input;
  }

  private static long[] startLength_isEven_and_isGreaterThanThree(long[] input) {
    if (input[endIndex_startLength - 1] == 1 && input[endIndex_startLength - 2] == 1) {
      change_startLength = -2;
      input[endIndex_startLength - 2] = input[endIndex_startLength] + 1;
      input[endIndex_startLength - 3]++;
      input[endIndex_startLength - 1] = 0;
      input[endIndex_startLength] = 0;
      return input;
    }

    if (input[endIndex_startLength - 1] > 1 && input[endIndex_startLength - 2] == 1) {
      change_startLength = -1;
      input[endIndex_startLength - 1]--;
      input[endIndex_startLength - 2] = input[endIndex_startLength] + 1;
      input[endIndex_startLength - 3]++;
      input[endIndex_startLength] = 0;
      return input;
    }

    if (input[endIndex_startLength - 1] == 1 && input[endIndex_startLength - 2] > 1) {
      input[endIndex_startLength]++;
      input[endIndex_startLength - 2]--;
      return input;
    }

    if (input[endIndex_startLength - 1] > 1 && input[endIndex_startLength - 2] > 1) {
      change_startLength = 1;
      input[endIndex_startLength + 1] = input[endIndex_startLength - 1] - 1;
      input[endIndex_startLength]++;
      input[endIndex_startLength - 1] = 1;
      input[endIndex_startLength - 2]--;
    }

    return input;
  }
}
