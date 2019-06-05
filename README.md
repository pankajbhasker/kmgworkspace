look-and-say Algorithm (Conway Sequence)
Definition
The look-and-say sequence is such a sequence that for creating each term of this sequence you have to read a number alphabetically and then write that alphabetic readings numerically. You can take any number as a starting number, and then follow this rule to produce next numbers.

Rules for Creating the Sequence
The rules are as follows:

Take any number you like.
Pronounce the number correctly. As for the number 1, It must be read as "one 1," where “one” represents the total digits of that number.
Now write the "one 1" numerically. So we get the number 11.
Next we can read 11 as "two 1." So the next number of this sequence is 21.
Apply the same method for finding the next number of the sequence.
The starting number may be any number you want.
This sequence grows indefinitely.
Only for same digits of number like 22, if you apply the above method , this will return the same result 22 instead of a sequence.
Only the digits 1, 2, and 3 are the members of this sequence. There must not be any other number.

In mathematics, the look-and-say sequence is the sequence of integers beginning as follows:

1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, ... (sequence A005150 in the OEIS).
To generate a member of the sequence from the previous member, read off the digits of the previous member, counting the number of digits in groups of the same digit. For example:

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
1211 is read off as "one 1, one 2, then two 1s" or 111221.
111221 is read off as "three 1s, two 2s, then one 1" or 312211.
The look-and-say sequence was introduced and analyzed by John Conway.[1]

The idea of the look-and-say sequence is similar to that of run-length encoding.

If started with any digit d from 0 to 9 then d will remain indefinitely as the last digit of the sequence. For d different from 1, the sequence starts as follows:

d, 1d, 111d, 311d, 13211d, 111312211d, 31131122211d, …
Ilan Vardi has called this sequence, starting with d = 3, the Conway sequence (sequence A006715 in the OEIS). (for d = 2, see OEIS: A006751)[2]
