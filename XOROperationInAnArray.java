// This Problem contains my solution to the [LeetCode "XOR Operation in an Array" problem] - https://leetcode.com/problems/xor-operation-in-an-array/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 1486. XOR Operation in an Array
// Problem Statement:

// You are given an integer n and an integer start.
// Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
// Return the bitwise XOR of all elements of nums.

// Example 1:
// Input: n = 5, start = 0
// Output: 8
// Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
// Where "^" corresponds to bitwise XOR operator.

// Example 2:
// Input: n = 4, start = 3
// Output: 8
// Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.

// Constraints:

// 1 <= n <= 1000
// 0 <= start <= 1000
// n == nums.length

// Solution:

class Solution {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int result = 0;
        for(int i=0; i<n; i++){
            nums[i] = start + 2 * i;
            result ^= nums[i];
        }
        return result;
    }
}
