// This Problem contains my solution to the [LeetCode "53. Maximum Subarray" problem] - https://leetcode.com/problems/maximum-subarray/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 53. Maximum Subarray
// Problem Statement:

// Given an integer array nums, find the subarray with the largest sum, and return its sum.

// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
  
// Example 2:
// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
  
// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

// Constraints:

// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Solution:

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int result= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(currentSum<0){
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            result = Math.max(result, currentSum);
        }
        return result;
    }
}

