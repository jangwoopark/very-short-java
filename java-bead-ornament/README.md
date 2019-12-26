There are  colors of beads. You have  beads of the  color. You want to make an ornament by joining all the beads together. You create the ornament by using the following algorithm:

Step # Arrange all the beads in any order such that beads of the same color are placed together.

Step # The ornament initially consists of only the first bead from the arrangement.

Step # For each subsequent bead in order, join it to a bead of the same color in the ornament. If there is no bead of the same color, it can be joined to any bead in the ornament.

All beads are distinct, even if they have the same color. How many different ornaments can be formed by following the above algorithm? Two ornaments are considered different if two beads are joined by a thread in one configuration, but not in the other.

Update/clarification

Think of the bead formation as a tree and not as a straight line. Any number of beads can be connected to a bead.

Input Format

The first line contains the number of test cases .  test cases follow. Each test case contains  on the first line - the number of colors of beads. The next line contains  integers, where the  integer  denotes the number of beads of the  color.

Constraints

Output Format

Output  lines, one for each test case. All answers should be output modulo .

Sample Input

5
2
2 1
2
2 2
1
4
2
3 1
5
1 1 1 1 1
Sample Output

2
4
16
9
125
Explanation

Testcase 1:

Let us label the beads A1,A2 and B1. Initially, they can be arranged in  ways - "A1,A2,B1", "A2,A1,B1", "B1,A1,A2", and "B1,A2,A1".

For each of the first two arrangements, an ornament can be formed in  ways (A1-A2-B1 or B1-A1-A2 from the first one and A2-A1-B1 or B1-A2-A1 from the second one).

For each of the last two arrangements, an ornament can be formed in  way.

However, of the total  possible ornaments, there are only  unique ones : A1 - A2 - B1, and A2 - A1 - B1.

Testcase 2:

The possible unique ornaments are A1 - A2 - B1 - B2, A1 - A2 - B2 - B1, A2 - A1 - B1 - B2, and A2 - A1 - B2 - B1.

Testcase 3:

For the third test-case, it might be easier to see there are only  types of graphs on  vertices: the path or the star. It's not hard to see that there are  paths and  stars (explanation courtesy: zlangley)

Testcase 5:

For the fifth test-case, a lot of people claimed that the total number of possible ways is . But that is wrong. The correct answer is . Here's the hint: Once again, you've to think of it as a tree.

So one possible arrangement can be:

A is a root node and has two edges (A-B and A-C). Now, think of B as a sub-root node with two edges (B-D and B-E). Similarly, you can figure out the other possible bead arrangements. This will lead you to the correct answer.
