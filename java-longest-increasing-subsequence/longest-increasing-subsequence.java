import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = in.nextInt();
        }
        List<Integer> list = new ArrayList<>(n);
        list.add(A[0]);
        int len = 1;
        int index;
        for (int i=0; i<n; i++) {
            if (A[i] > list.get(len-1)) {
                list.add(A[i]);
                len++;
            }else {
                index = Collections.binarySearch(list, A[i]);
                if (index < 0) {
                    index += 1;
                    index *= -1;
                    list.set(index, A[i]);
                }
            }
        }
        System.out.println(len);
    }
}
