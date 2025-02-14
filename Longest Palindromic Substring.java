// This Problem contains my solution to the [LeetCode "5. Longest Palindromic Substring" problem] - https://leetcode.com/problems/longest-palindromic-substring/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 5. Longest Palindromic Substring
// Problem Statement:

// Given a string s, return the longest palindromic substring in s.

// Example 1:
// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.

// Example 2:
// Input: s = "cbbd"
// Output: "bb"

// Constraints:

// 1 <= s.length <= 1000
// s consist of only digits and English letters.

// Solution:

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        
        return longest;
    }
    
    private boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

