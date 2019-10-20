After completing her final semester, Savita is back home. She is excited to meet all her friends. Her  friends live in different houses spread across the city.

There are  roads connecting the houses. The road network formed is connected and does not contain self loops and multiple roads between same pair of houses. Savita and Friends decide to meet.

Savita wants to choose a point(not necessarily an integer)  on the road numbered , such that, the maximum of  for all  is minimised,
where  is the shortest distance between the 'th friend and .

If 'th road connects friend  and friend  you should print distance of chosen point from . Also, print the  for all . If there is more than one solution, print the one in which the point  is closest to .

Note:

Use scanf/printf instead of cin/cout. Large input files.
Order of  and  as given in the input must be maintained. If P is at a distance of 8 from  and 2 from , you should print 8 and not 2.
Input Format

First line contain , the number of testcases.
T testcases follow.
First Line of each testcase contains 3 space separated integers  .
Next  lines contain description of the th road : three space separated integers , where  is the length of road connecting  and .

Constraints







Output Format

For each testcase, print two space separated values in one line. The first value is the distance of  from the point  and the second value is the maximum of all the possible shortest paths between  and all of Savita's and her friends' houses. Round both answers to  decimal digits and print exactly  digits after the decimal point.

Sample Input

2
2 1 1
1 2 10
4 4 1
1 2 10
2 3 10
3 4 1
4 1 5
Sample Output

5.00000 5.00000
2.00000 8.00000
Explanation

First testcase:
As  = 1, they will meet at the point  on the road that connects friend  with friend . If we choose mid point then distance for both of them will be . In any other position the maximum of distance will be more than .

Second testcase:
As  = 1, they will meet at a point  on the road connecting friend  and friend . If we choose point at a distance of  from friend : Friend  will have to travel distance .
Friend  will have to travel distance .
Friend  will have to travel distance .
Friend  will have to travel distance .
So, the maximum will be .
In any other position of point choosen, the maximum distance will be more than .

Timelimits

Timelimits for this problem is 2 times the environment limit.
