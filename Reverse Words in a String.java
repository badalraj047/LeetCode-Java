// This Problem contains my solution to the [LeetCode "151. Reverse Words in a String" problem] - https://leetcode.com/problems/reverse-words-in-a-string/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 151. Reverse Words in a String
// Problem Statement:

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

// Example 1:
// Input: s = "the sky is blue"
// Output: "blue is sky the"
  
// Example 2:
// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.
  
// Example 3:
// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

// Constraints:

// 1 <= s.length <= 104
// s contains English letters (upper-case and lower-case), digits, and spaces ' '.
// There is at least one word in s.

// Solution:

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String words[] = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length -1; i>=0; i--){
            sb.append(words[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

