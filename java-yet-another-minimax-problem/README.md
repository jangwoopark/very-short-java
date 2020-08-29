You are given  non-negative integers, . We define the score for some permutation () of length  to be the maximum of  for .

Find the permutation with the minimum possible score and print its score.

Note:  is the exclusive-OR (XOR) operator.

Input Format

The first line contains single integer, , denoting the number of integers.
The second line contains  space-separated integers, , describing the respective integers.

Constraints

Output Format

Print a single integer denoting the minimum possible score.

Sample Input 0

4
1 2 3 4
Sample Output 0

5
Sample Input 1

3
1 2 3
Sample Output 1

2
Explanation

Sample Case 0:
The permutation with the minimum score is :



Because the permutation's score is the maximum of these values, we print  on a new line.

Sample Case 1:
The permutation with the minimum score is :


Because the permutation's score is the maximum of these values, we print  on a new line.
