// This Problem contains my solution to the [LeetCode "1832. Check if the Sentence Is Pangram" problem] - https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 1832. Check if the Sentence Is Pangram
// Problem Statement:

// A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

// Example 1:
// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.

// Example 2:
// Input: sentence = "leetcode"
// Output: false 

// Constraints:

// 1 <= sentence.length <= 1000
// sentence consists of lowercase English letters.

// Solution:

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            set.add(c);
            if (set.size() == 26) {
                return true;
            }
        }
        return set.size() == 26;
    }
}



