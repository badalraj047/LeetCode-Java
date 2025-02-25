// This Problem contains my solution to the [LeetCode "283. Move Zeroes" problem] - https://leetcode.com/problems/move-zeroes/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 283. Move Zeroes
// Problem Statement:

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
  
// Example 2:
// Input: nums = [0]
// Output: [0]

// Constraints:

// 1 <= nums.length <= 10^4
// -231 <= nums[i] <= 231 - 1

// Solution:

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        for (int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
