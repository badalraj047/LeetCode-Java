// This Problem contains my solution to the [LeetCode "Difference Between Element Sum and Digit Sum of an Array" problem] - https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 2535. Difference Between Element Sum and Digit Sum of an Array
// Problem Statement:

// You are given a positive integer array nums.
// The element sum is the sum of all the elements in nums.
// The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
// Return the absolute difference between the element sum and digit sum of nums.
// Note that the absolute difference between two integers x and y is defined as |x - y|.

// Example 1:
// Input: nums = [1,15,6,3]
// Output: 9
// Explanation: 
// The element sum of nums is 1 + 15 + 6 + 3 = 25.
// The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
// The absolute difference between the element sum and digit sum is |25 - 16| = 9.

// Example 2:
// Input: nums = [1,2,3,4]
// Output: 0
// Explanation:
// The element sum of nums is 1 + 2 + 3 + 4 = 10.
// The digit sum of nums is 1 + 2 + 3 + 4 = 10.
// The absolute difference between the element sum and digit sum is |10 - 10| = 0.

// Constraints:

// 1 <= nums.length <= 2000
// 1 <= nums[i] <= 2000

// Solution:

class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i]; 
        }
        for (int p = 0; p < nums.length; p++) {
            int num = nums[p];
            while (num > 0) {
                digitSum += num % 10; 
                num /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}


