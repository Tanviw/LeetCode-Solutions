# LeetCode-Solutions

----------

## **List** ##


#####Tags:Array

* [167. Two Sum II - Input array is sorted](#1.1)
* [169. Majority Element](#1.2)
* [268. Missing Number](#1.3)
* [283. Move Zeroes](#1.4)
* [380. Insert Delete GetRandom O(1)](#1.5)
* [381. Insert Delete GetRandom O(1) - Duplicates allowed](#1.6)
* [414. Third Maximum Number](#1.7)
* [442. Find All Duplicates in an Array](#1.8)
* [448. Find All Numbers Disappeared in an Array](#1.9)

#####Tags:Hash Table
* [463. Island Perimeter](#2.1)
* [454. 4Sum II](#2.2)
* [451. Sort Characters By Frequency](2.3)

#####Tags:Math
* [413. Arithmetic Slices](#3.1)

#####Tags:Two Pointers
* [345. Reverse Vowels of a String](#4.1)
* [344. Reverse String](#4.2)

#####Tags:String
* [459. Repeated Substring Pattern](#5.1)
* [383. Ransom Note](#5.2)
* [385. Mini Parser](#5.3)

#####Tags:Dynanmic Programming
* [338. Counting Bits](#6.1)
* [312. Burst Balloons](#6.2)

#####Tags:Greedy
* [406. Queue Reconstruction by Height](#7.1)

#####Tags: Depth-first Search
* [417. Pacific Atlantic Water Flow](#8.1)
* [394. Decode String](#8.2)
* [104. Maximum Depth of Binary Tree](#8.3)
* [100. Same Tree](#8.4)


## **Detail** ##

<h3 id="1.1">167. Two Sum II - Input array is sorted</h3>

#####LeetCode Link:
[https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

#####Problem description:
 Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/167.%20Two%20Sum%20II%20-%20Input%20array%20is%20sorted.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/167.%20Two%20Sum%20II%20-%20Input%20array%20is%20sorted.java "167. Two Sum II - Input array is sorted")

<h3 id="1.2">169. Majority Element</h3>

#####LeetCode Link:
[https://leetcode.com/problems/majority-element/](https://leetcode.com/problems/majority-element/)

#####Problem description:
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/169.%20Majority%20Element.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/169.%20Majority%20Element.java)

<h3 id="1.3">268. Missing Number</h3>

#####LeetCode Link:
[https://leetcode.com/problems/missing-number/](https://leetcode.com/problems/missing-number/)

#####Problem description:
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/268.%20Missing%20Number.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/268.%20Missing%20Number.java)

<h3 id="1.4">283. Move Zeroes</h3>

#####LeetCode Link:
[https://leetcode.com/problems/move-zeroes/](https://leetcode.com/problems/move-zeroes/)

#####Problem description:
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.


#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/283.%20Move%20Zeroes.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/283.%20Move%20Zeroes.java)

<h3 id="1.5">380. Insert Delete GetRandom O(1)</h3>

#####LeetCode Link:
[https://leetcode.com/problems/insert-delete-getrandom-o1/](https://leetcode.com/problems/insert-delete-getrandom-o1/)

#####Problem description:
Design a data structure that supports all following operations in average O(1) time.

insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
Example:

// Init an empty set.
RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomSet.insert(1);

// Returns false as 2 does not exist in the set.
randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
randomSet.remove(1);

// 2 was already in the set, so return false.
randomSet.insert(2);

// Since 1 is the only number in the set, getRandom always return 1.
randomSet.getRandom();

#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/380.%20Insert%20Delete%20GetRandom%20O(1).java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/380.%20Insert%20Delete%20GetRandom%20O(1).java)

<h3 id="1.6">381. Insert Delete GetRandom O(1) - Duplicates allowed</h3>

#####LeetCode Link:
[https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/](https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/)

#####Problem description:
Design a data structure that supports all following operations in average O(1) time.

Note: Duplicate elements are allowed.
insert(val): Inserts an item val to the collection.
remove(val): Removes an item val from the collection if present.
getRandom: Returns a random element from current collection of elements. The probability of each element being returned is linearly related to the number of same value the collection contains.
Example:

// Init an empty collection.
RandomizedCollection collection = new RandomizedCollection();

// Inserts 1 to the collection. Returns true as the collection did not contain 1.
collection.insert(1);

// Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
collection.insert(1);

// Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
collection.insert(2);

// getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
collection.getRandom();

// Removes 1 from the collection, returns true. Collection now contains [1,2].
collection.remove(1);

// getRandom should return 1 and 2 both equally likely.
collection.getRandom();

#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/381.%20Insert%20Delete%20GetRandom%20O(1)%20-%20Duplicates%20allowed.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/381.%20Insert%20Delete%20GetRandom%20O(1)%20-%20Duplicates%20allowed.java)

<h3 id="1.7">414. Third Maximum Number</h3>

#####LeetCode Link:
[https://leetcode.com/problems/third-maximum-number/](https://leetcode.com/problems/third-maximum-number/)

#####Problem description:
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/414.%20Third%20Maximum%20Number.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/414.%20Third%20Maximum%20Number.java)

<h3 id="1.8">442. Find All Duplicates in an Array</h3>

#####LeetCode Link:
[https://leetcode.com/problems/find-all-duplicates-in-an-array/](https://leetcode.com/problems/find-all-duplicates-in-an-array/)
#####Problem description:
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]

#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/442.%20Find%20All%20Duplicates%20in%20an%20Array.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/442.%20Find%20All%20Duplicates%20in%20an%20Array.java)
<h3 id="1.9">448. Find All Numbers Disappeared in an Array</h3>

#####LeetCode Link:
[https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)
#####Problem description:
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/448.%20Find%20All%20Numbers%20Disappeared%20in%20an%20Array.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Array/448.%20Find%20All%20Numbers%20Disappeared%20in%20an%20Array.java)

----------

<h3 id="2.1">463. Island Perimeter</h3>

#####LeetCode Link:
[https://leetcode.com/problems/island-perimeter/](https://leetcode.com/problems/island-perimeter/)
#####Problem description:
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16

Explanation: The perimeter is the 16 yellow stripes in the image below:

![](https://leetcode.com/static/images/problemset/island.png)
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Hash%20Table/463.%20Island%20Perimeter.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Hash%20Table/463.%20Island%20Perimeter.java)

<h3 id="2.2">454. 4Sum II</h3>
#####LeetCode Link:
[https://leetcode.com/problems/4sum-ii/](https://leetcode.com/problems/4sum-ii/)
#####Problem description:
Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.

To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤ N ≤ 500. All integers are in the range of -228 to 228 - 1 and the result is guaranteed to be at most 231 - 1.

Example:

Input:
A = [ 1, 2]
B = [-2,-1]
C = [-1, 2]
D = [ 0, 2]

Output:
2

Explanation:
The two tuples are:
1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Hash%20Table/454.%204Sum%20II.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Hash%20Table/454.%204Sum%20II.java)

<h3 id="2.3">451. Sort Characters By Frequency</h3>
#####LeetCode Link:
[https://leetcode.com/problems/sort-characters-by-frequency/](https://leetcode.com/problems/sort-characters-by-frequency/)
#####Problem description:
Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
#####Source code:



----------

<h3 id="3.1">413. Arithmetic Slices</h3>
#####LeetCode Link:
[https://leetcode.com/problems/arithmetic-slices/](https://leetcode.com/problems/arithmetic-slices/)
#####Problem description:
A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

For example, these are arithmetic sequence:

1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
The following sequence is not arithmetic.

1, 1, 2, 5, 7

A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

A slice (P, Q) of array A is called arithmetic if the sequence:
A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

The function should return the number of arithmetic slices in the array A.


Example:

A = [1, 2, 3, 4]

return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
#####Source code:
[[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Math/413.%20Arithmetic%20Slices.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Math/413.%20Arithmetic%20Slices.java)]([https://github.com/Tanviw/LeetCode-Solutions/blob/master/Math/413.%20Arithmetic%20Slices.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Math/413.%20Arithmetic%20Slices.java))

----------

<h3 id="4.1">345. Reverse Vowels of a String</h3>
#####LeetCode Link:
[https://leetcode.com/problems/reverse-vowels-of-a-string/](https://leetcode.com/problems/reverse-vowels-of-a-string/)
#####Problem description:
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
#####Source code:

[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Two%20Pointers/345.%20Reverse%20Vowels%20of%20a%20String.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Two%20Pointers/345.%20Reverse%20Vowels%20of%20a%20String.java)
<h3 id="4.2">344. Reverse String</h3>
#####LeetCode Link:
[https://leetcode.com/problems/reverse-string/](https://leetcode.com/problems/reverse-string/)
#####Problem description:
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
#####Source code:

[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Two%20Pointers/344.%20Reverse%20String.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Two%20Pointers/344.%20Reverse%20String.java)

----------

<h3 id="5.1">459. Repeated Substring Pattern</h3>
#####LeetCode Link:
[https://leetcode.com/problems/repeated-substring-pattern/](https://leetcode.com/problems/repeated-substring-pattern/)
#####Problem description:
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
Example 2:
Input: "aba"

Output: False
Example 3:
Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/String/459.%20Repeated%20Substring%20Pattern.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/String/459.%20Repeated%20Substring%20Pattern.java)

<h3 id="5.2">383. Ransom Note</h3>
#####LeetCode Link:
[https://leetcode.com/problems/ransom-note/](https://leetcode.com/problems/ransom-note/)
#####Problem description:
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/String/383.%20Ransom%20Note.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/String/383.%20Ransom%20Note.java)

<h3 id="5.3">385. Mini Parser</h3>
#####LeetCode Link:
[https://leetcode.com/problems/mini-parser/](https://leetcode.com/problems/mini-parser/)
#####Problem description:
Given a nested list of integers represented as a string, implement a parser to deserialize it.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.

Note: You may assume that the string is well-formed:

String is non-empty.
String does not contain white spaces.
String contains only digits 0-9, [, - ,, ].
Example 1:

Given s = "324",

You should return a NestedInteger object which contains a single integer 324.
Example 2:

Given s = "[123,[456,[789]]]",

Return a NestedInteger object containing a nested list with 2 elements:

1. An integer containing value 123.
2. A nested list containing two elements:

    i.  An integer containing value 456.

    ii. A nested list with one element:

         a. An integer containing value 789.
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/String/385.%20Mini%20Parser.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/String/385.%20Mini%20Parser.java)

----------

<h3 id="6.1">338. Counting Bits</h3>
#####LeetCode Link:
[https://leetcode.com/problems/counting-bits/](https://leetcode.com/problems/counting-bits/)
#####Problem description:
Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
Space complexity should be O(n).
Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
Hint:

You should make use of what you have produced already.
Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
Or does the odd/even status of the number help you in calculating the number of 1s?
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Dynamic%20Programming/338.%20Counting%20Bits.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Dynamic%20Programming/338.%20Counting%20Bits.java)

<h3 id="6.2">312. Burst Balloons</h3>
#####LeetCode Link:
[https://leetcode.com/problems/burst-balloons/](https://leetcode.com/problems/burst-balloons/)
#####Problem description:
Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note: 
(1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
(2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100

Example:

Given [3, 1, 5, 8]

Return 167

    nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
   coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Dynamic%20Programming/312.%20Burst%20Balloons.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Dynamic%20Programming/312.%20Burst%20Balloons.java)

----------

<h3 id="7.1">406. Queue Reconstruction by Height</h3>
#####LeetCode Link:
[https://leetcode.com/problems/queue-reconstruction-by-height/](https://leetcode.com/problems/queue-reconstruction-by-height/)
#####Problem description:
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

Example

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Greedy/406.%20Queue%20Reconstruction%20by%20Height.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Greedy/406.%20Queue%20Reconstruction%20by%20Height.java)

----------

<h3 id="8.1">417. Pacific Atlantic Water Flow</h3>
#####LeetCode Link:
[https://leetcode.com/problems/pacific-atlantic-water-flow/](https://leetcode.com/problems/pacific-atlantic-water-flow/)
#####Problem description:
Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent, the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.

Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.

Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.

Note:
The order of returned grid coordinates does not matter.
Both m and n are less than 150.
Example:

Given the following 5x5 matrix:

    Pacific ~   ~   ~   ~   ~
       ~  1   2   2   3  (5) *
       ~  3   2   3  (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (5)  1   1   2   4  *
          *   *   *   *   * Atlantic

Return:

[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Depth-first%20Search/417.%20Pacific%20Atlantic%20Water%20Flow.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Depth-first%20Search/417.%20Pacific%20Atlantic%20Water%20Flow.java)

<h3 id="8.2">394. Decode String</h3>
#####LeetCode Link:
[https://leetcode.com/problems/decode-string/](https://leetcode.com/problems/decode-string/)
#####Problem description:
Given an encoded string, return it's decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].

Examples:

s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Depth-first%20Search/394.%20Decode%20String.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Depth-first%20Search/394.%20Decode%20String.java)

<h3 id="8.3">104. Maximum Depth of Binary Tree</h3>
#####LeetCode Link:
[https://leetcode.com/problems/maximum-depth-of-binary-tree/](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
#####Problem description:
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Depth-first%20Search/104.%20Maximum%20Depth%20of%20Binary%20Tree.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Depth-first%20Search/104.%20Maximum%20Depth%20of%20Binary%20Tree.java)

<h3 id="8.4">100. Same Tree</h3>
#####LeetCode Link:
[https://leetcode.com/problems/same-tree/](https://leetcode.com/problems/same-tree/)
#####Problem description:
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
#####Source code:
[https://github.com/Tanviw/LeetCode-Solutions/blob/master/Depth-first%20Search/100.%20Same%20Tree.java](https://github.com/Tanviw/LeetCode-Solutions/blob/master/Depth-first%20Search/100.%20Same%20Tree.java)
