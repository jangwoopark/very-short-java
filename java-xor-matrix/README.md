Consider a zero-indexed matrix with  rows and  columns, where each row is filled gradually. Given the first row of the matrix, you can generate the elements in the subsequent rows using the following formula:

Each row is generated one by one, from the second row through the last row. Given the first row of the matrix, find and print the elements of the last row as a single line of space-separated integers.

Note: The  operator denotes bitwise XOR.

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of columns in the matrix) and  (the number of rows in the matrix).
The second line contains  space-separated integers denoting the respective values of the elements in the matrix's first row.

Constraints

Output Format

Print  space-separated integers denoting the respective values of the elements in the last row of the matrix.

Sample Input 0

4 2
6 7 1 3
Sample Output 0

1 6 2 5
Explanation 0

We use the formula given above to calculate the  values in the last row of the matrix:

We then print each value (in order) as a single line of space-separated integers.
