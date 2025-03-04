// This Problem contains my solution to the [LeetCode "367. Valid Perfect Square" problem] - https://leetcode.com/problems/valid-perfect-square/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 367. Valid Perfect Square
// Problem Statement:

// Given a positive integer num, return true if num is a perfect square or false otherwise.
// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
// You must not use any built-in library function, such as sqrt.

// Example 1:
// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
  
// Example 2:
// Input: num = 14
// Output: false
// Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

// Constraints:

// 1 <= num <= 231 - 1

// Solution:

class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        while(low<=high){
            long mid = low + (high-low) / 2;
            long square = mid*mid;
            if(num == square){
                return true;
            }else if(square<num){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
