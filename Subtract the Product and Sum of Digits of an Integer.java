// This Problem contains my solution to the [LeetCode "1281. Subtract the Product and Sum of Digits of an Integer" problem] - https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 1281. Subtract the Product and Sum of Digits of an Integer
// Problem Statement:

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
// Example 1:
// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15

// Example 2:
// Input: n = 4421
// Output: 21
// Explanation: 
// Product of digits = 4 * 4 * 2 * 1 = 32 
// Sum of digits = 4 + 4 + 2 + 1 = 11 
// Result = 32 - 11 = 21

// Constraints:
// 1 <= n <= 10^5

// Solution:

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while(n>0){
            int store = n % 10;
            sum += store;
            mul *= store;
            n /= 10;
        }
        return mul-sum;
    }
}


