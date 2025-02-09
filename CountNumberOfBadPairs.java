// This Problem contains my solution to the [LeetCode "Count Number of Bad Pairs" problem] - https://leetcode.com/problems/count-number-of-bad-pairs/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 2364. Count Number of Bad Pairs
// Problem Statement:

// You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i < j and j - i != nums[j] - nums[i].
// Return the total number of bad pairs in nums.

// Example 1:

// Input: nums = [4,1,3,3]
// Output: 5
// Explanation: The pair (0, 1) is a bad pair since 1 - 0 != 1 - 4.
// The pair (0, 2) is a bad pair since 2 - 0 != 3 - 4, 2 != -1.
// The pair (0, 3) is a bad pair since 3 - 0 != 3 - 4, 3 != -1.
// The pair (1, 2) is a bad pair since 2 - 1 != 3 - 1, 1 != 2.
// The pair (2, 3) is a bad pair since 3 - 2 != 3 - 3, 1 != 0.
// There are a total of 5 bad pairs, so we return 5.

// Example 2:
// Input: nums = [1,2,3,4,5]
// Output: 0
// Explanation: There are no bad pairs.

// Constraints:

// 1 <= nums.length <= 10^5
// 1 <= nums[i] <= 10^9

// Solution:

class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        Map<Integer,Integer> map1 = new HashMap<>();
        int diff = 0;
        long countgoodpair = 0;

        for(int i=0;i<nums.length;i++){
            diff = nums[i]-i;    
            if(map1.containsKey(diff))
                countgoodpair += map1.get(diff);
            map1.put(diff,map1.getOrDefault(diff,0) + 1);
        }
        long total = (n*(n-1)/2);
        return total - countgoodpair;   
    }
}


