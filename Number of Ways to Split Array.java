// This Problem contains my solution to the [LeetCode "2270. Number of Ways to Split Array" problem] - https://leetcode.com/problems/number-of-ways-to-split-array/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 2270. Number of Ways to Split Array
// Problem Statement:

// You are given a 0-indexed integer array nums of length n.
// nums contains a valid split at index i if the following are true:
// The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
// There is at least one element to the right of i. That is, 0 <= i < n - 1.
// Return the number of valid splits in nums.

// Example 1:
// Input: nums = [10,4,-8,7]
// Output: 2
// Explanation: 
// There are three ways of splitting nums into two non-empty parts:
// - Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 >= 3, i = 0 is a valid split.
// - Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 >= -1, i = 1 is a valid split.
// - Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 < 7, i = 2 is not a valid split.
// Thus, the number of valid splits in nums is 2.

// Example 2:
// Input: nums = [2,3,1,0]
// Output: 2
// Explanation: 
// There are two valid splits in nums:
// - Split nums at index 1. Then, the first part is [2,3], and its sum is 5. The second part is [1,0], and its sum is 1. Since 5 >= 1, i = 1 is a valid split. 
// - Split nums at index 2. Then, the first part is [2,3,1], and its sum is 6. The second part is [0], and its sum is 0. Since 6 >= 0, i = 2 is a valid split.

// Constraints:

// 2 <= nums.length <= 105
// -105 <= nums[i] <= 105

// Solution:

class Solution {
    public int waysToSplitArray(int[] nums) {
        long store = 0;
        int count = 0;
        long store2 = 0;
        for(int i=0; i<nums.length; i++){
            store += nums[i];
        }
        for(int p=0; p<nums.length-1; p++){
            store2 += nums[p];
            if(store2 >= store-store2){
                count++;
            }
        }
        return count;

    }
}

