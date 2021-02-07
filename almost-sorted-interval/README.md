Shik loves sorted intervals. But currently he does not have enough time to sort all the numbers. So he decided to use Almost sorted intervals. An Almost sorted interval is a consecutive subsequence in a sequence which satisfies the following property:

The first number is the smallest.
The last number is the largest.
Please help him count the number of almost sorted intervals in this permutation.

Note: Two intervals are different if at least one of the starting or ending indices are different.

Input Format
The first line contains an integer N.
The second line contains a permutation from 1 to N.

Output Format
Output the number of almost sorted intervals.

Constraints
1 ≤ N ≤ 106

Sample Input

5
3 1 2 5 4
Sample Output

8
Explanation
The subsequences [3], [1], [1 2], [1 2 5], [2], [2 5], [5], [4] are almost sorted intervals.
