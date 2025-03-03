// This Problem contains my solution to the [LeetCode "34. Find First and Last Position of Element in Sorted Array" problem] - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 34. Find First and Last Position of Element in Sorted Array
// Problem Statement:

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]

// Constraints:

// 0 <= nums.length <= 10^5
// -10^9 <= nums[i] <= 10^9
// nums is a non-decreasing array.
// -10^9 <= target <= 10^9

// Solution:

class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high= nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}

