// This Problem contains my solution to the [LeetCode Container With Most Water problem] - https://leetcode.com/problems/container-with-most-water/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 11. Container With Most Water
// Problem Statement:

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:
// Input: height = [1,1]
// Output: 1

// Constraints:

// n == height.length
// 2 <= n <= 10^5
// 0 <= height[i] <= 10^4

// Solution:

class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left=0;
        int right=height.length - 1;
        while(left<right){
            int w = right-left;
            int h = Math.min(height[left], height[right]);
            int cvol = w*h;
            maxWater = Math.max(maxWater, cvol);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
                }
        }
        return maxWater;
    }
}
