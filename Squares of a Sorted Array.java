// This Problem contains my solution to the [LeetCode "977. Squares of a Sorted Array" problem] - https://leetcode.com/problems/squares-of-a-sorted-array/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 977. Squares of a Sorted Array
// Problem Statement:

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

// Example 1:
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].

// Example 2:
// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums is sorted in non-decreasing order.

// Solution:

class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> store = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            store.add(nums[i]*nums[i]);
        }
        Collections.sort(store);
        int[] result = new int[store.size()];
        for (int i = 0; i < store.size(); i++) {
            result[i] = store.get(i);
        }
        
        return result;
    }
}

