// This Problem contains my solution to the [LeetCode Add Digits problem] - https://leetcode.com/problems/add-digits/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 258. Add Digits
// Problem Statement:

// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

// Example 1:
// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.

// Example 2:
// Input: num = 0
// Output: 0
 
// Constraints:

// 0 <= num <= 2^31 - 1

// Solution:

class Solution {
    public int addDigits(int num) {
        if (num == 0) 
        return 0;
        return 1 + (num - 1) % 9;
    }
}


