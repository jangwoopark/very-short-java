Let  denote an arithmetic progression (AP) with first term  and common difference , i.e.  denotes an infinite . You are given  APs => . Let  denote the sequence obtained by multiplying these APs.

Multiplication of two sequences is defined as follows. Let the terms of the first sequence be , and terms of the second sequence be . The sequence obtained by multiplying these two sequences is
If  are the terms of a sequence, then the terms of the first difference of this sequence are given by  calculated as  respectively. Similarly, the second difference is given by , and so on.

We say that the  difference of a sequence is a constant if all the terms of the  difference are equal.

Let  be a sequence defined as => 
Similarly,  is defined as => product of .

Task:
Can you find the smallest  for which the  difference of the sequence  is a constant? You are also required to find this constant value.

You will be given many operations. Each operation is of one of the two forms:

1) 0 i j => 0 indicates a query . You are required to find the smallest  for which the  difference of  is a constant. You should also output this constant value.

2) 1 i j v => 1 indicates an update . For all , we update .

Input Format
The first line of input contains a single integer , denoting the number of APs.
Each of the next  lines consists of three integers  .
The next line consists of a single integer , denoting the number of operations. Each of the next  lines consist of one of the two operations mentioned above.  

Output Format
For each query, output a single line containing two space-separated integers  and .  is the smallest value for which the  difference of the required sequence is a constant.  is the value of this constant. Since  might be large, output the value of  modulo 1000003.

Note:  will always be such that it fits into a signed 64-bit integer. All indices for query and update are 1-based. Do not take modulo 1000003 for .

Constraints



For updates of the form 1 i j v, 
 

Sample Input

2  
1 2 1  
5 3 1  
3  
0 1 2  
1 1 1 1  
0 1 1  
Sample Output

2 12  
2 8  
Explanation

The first sequence given in the input is => 
The second sequence given in the input is => 

For the first query operation, we have to consider the product of these two sequences:
=> 
=> 
First difference is => 
Second difference is =>  This is a constant and hence the output is 2 12.

After the update operation 1 1 1 1, the first sequence becomes => 
i.e => 
For the second query, we consider only the first sequence => 
First difference is => 
Second difference is =>  This is a constant and hence the output is 2 8
