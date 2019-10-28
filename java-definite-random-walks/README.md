Alex has a board game consisting of:

A chip for marking his current location on the board.
 fields numbered from  to . Each position  has a value, , denoting the next position for the chip to jump to from that field.
A die with  faces numbered from  to . Each face  has a probability, , of being rolled.
Alex then performs the following actions:

Begins the game by placing the chip at a position in a field randomly and with equiprobability.
Takes  turns; during each turn he:
Rolls the die. We'll denote the number rolled during a turn as .
Jumps the chip  times. Recall that each field contains a value denoting the next field number to jump to.
After completing  turns, the game ends and he must calculate the respective probabilities for each field as to whether the game ended with the chip in that field.
Given , , , the game board, and the probabilities for each die face, print  lines where each line  contains the probability that the chip is on field  at the end of the game.

Note: All the probabilities in this task are rational numbers modulo . That is, if the probability can be expressed as the irreducible fraction  where , then it corresponds to the number  (or, alternatively, ). Click here to learn about Modular Multiplicative Inverse.

Input Format

The first line contains three space-separated integers describing the respective values of  (the number of positions),  (the number of die faces), and  (the number of turns).
The second line contains  space-separated integers describing the respective values of each  (i.e., the index of the field that field  can transition to).
The third line contains  space-separated integers describing the respective values of each  (where ) describing the probabilities of the faces of the -sided die.

Constraints

The sum of  is 
Note: The time limit for this challenge is doubled for all languages. Read more about standard time limits at our environment page.

Output Format

Print  lines of output in which each line  contains a single integer,  (where ), denoting the probability that the chip will be on field  after  turns.

Sample Input 0

4 5 1
2 3 2 4
332748118 332748118 332748118 0 0
Sample Output 0

582309206
332748118
332748118
748683265
Explanation 0

The diagram below depicts the respective probabilities of each die face being rolled:

image

The diagram below depicts each field with an arrow pointing to the next field:

image

There are four equiprobable initial fields, so each field has a  probability of being the chip's initial location. Next, we calculate the probability that the chip will end up in each field after  turn:

The only way the chip ends up in this field is if it never jumps from the field, which only happens if Alex rolls a . So, this field's probability is . We then calculate and print the result of  on a new line.
The chip can end up in field  after one turn in the following scenarios:

Start in field  and roll a , the probability for which is .
Start in field  and roll a  or a , the probability for which is .
Start in field  and roll a , the probability for which is .
After summing these probabilities, we get a total probability of  for the field. We then calculate and print the result of  on a new line.

The chip can end up in field  after one turn in the following scenarios:

Start in field  and roll a , the probability for which is .
Start in field  and roll a , the probability for which is .
Start in field  and roll a  or a , the probability for which is .
After summing these probabilities, we get a total probability of  for the field. We then calculate and print the result of  on a new line.

If the chip is initially placed in field , it will always end up in field  regardless of how many turns are taken (because this field loops back onto itself). Thus, this field's probability is . We then calculate and print the result of  on a new line.
