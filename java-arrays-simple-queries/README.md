Given two numbers  and .  indicates the number of elements in the array  and  indicates number of queries. You need to perform two types of queries on the array .

You are given  queries. Queries can be of two types, type 1 and type 2.

Type 1 queries are represented as 1 i j : Modify the given array by removing elements from  to  and adding them to the front.

Type 2 queries are represented as 2 i j : Modify the given array by removing elements from  to  and adding them to the back.

Your task is to simply print  of the resulting array after the execution of  queries followed by the resulting array.

Note While adding at back or front the order of elements is preserved.

Input Format

First line consists of two space-separated integers,  and .
Second line contains  integers, which represent the elements of the array.
 queries follow. Each line contains a query of either type 1 or type 2 in the form 

Constraints



Output Format

Print the absolute value i.e.  in the first line.
Print elements of the resulting array in the second line. Each element should be seperated by a single space.

Sample Input

8 4
1 2 3 4 5 6 7 8
1 2 4
2 3 5
1 4 7
2 1 4
Sample Output

1
2 3 6 5 7 8 4 1
Explanation

Given array is .
After execution of query , the array becomes .
After execution of query , the array becomes .
After execution of query , the array becomes .
After execution of query , the array becomes .
Now  is  i.e.  and the array is Given two numbers  and .  indicates the number of elements in the array  and  indicates number of queries. You need to perform two types of queries on the array .

You are given  queries. Queries can be of two types, type 1 and type 2.

Type 1 queries are represented as 1 i j : Modify the given array by removing elements from  to  and adding them to the front.

Type 2 queries are represented as 2 i j : Modify the given array by removing elements from  to  and adding them to the back.

Your task is to simply print  of the resulting array after the execution of  queries followed by the resulting array.

Note While adding at back or front the order of elements is preserved.

Input Format

First line consists of two space-separated integers,  and .
Second line contains  integers, which represent the elements of the array.
 queries follow. Each line contains a query of either type 1 or type 2 in the form 

Constraints



Output Format

Print the absolute value i.e.  in the first line.
Print elements of the resulting array in the second line. Each element should be seperated by a single space.

Sample Input

8 4
1 2 3 4 5 6 7 8
1 2 4
2 3 5
1 4 7
2 1 4
Sample Output

1
2 3 6 5 7 8 4 1
Explanation

Given array is .
After execution of query , the array becomes .
After execution of query , the array becomes .
After execution of query , the array becomes .
After execution of query , the array becomes .
Now  is  i.e.  and the array is 
