// This Problem contains my solution to the [LeetCode "Count the Digits That Divide a Number" problem] - https://leetcode.com/problems/count-the-digits-that-divide-a-number/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 2520. Count the Digits That Divide a Number
// Problem Statement:

// Given an integer num, return the number of digits in num that divide num.
// An integer val divides nums if nums % val == 0.

// Example 1:
// Input: num = 7
// Output: 1
// Explanation: 7 divides itself, hence the answer is 1.

// Example 2:
// Input: num = 121
// Output: 2
// Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.

// Example 3:
// Input: num = 1248
// Output: 4
// Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

// Constraints:

// 1 <= num <= 10^9
// num does not contain 0 as one of its digits.

// Solution:

class Solution {
    public int countDigits(int num) {
        int originalNo = num;
        int count=0;
        while(num>0){
            int digit = num%10;
            if(originalNo % digit ==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}


