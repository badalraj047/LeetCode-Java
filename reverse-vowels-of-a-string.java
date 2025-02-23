// This Problem contains my solution to the [LeetCode "345. Reverse Vowels of a String" problem] - https://leetcode.com/problems/reverse-vowels-of-a-string/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 345. Reverse Vowels of a String
// Problem Statement:

// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"
// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"

// Constraints:

// 1 <= s.length <= 3 * 10^5
// s consist of printable ASCII characters.

// Solution:

class Solution {
    public String reverseVowels(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] arr = s.toCharArray();
        Set<Character> vowelSet = new HashSet<>();
        for (char c : vowels) {
            vowelSet.add(c);
        }
        List<Character> vowelList = new ArrayList<>();
        for (char c : arr) {
            if (vowelSet.contains(c)) {
                vowelList.add(c);
            }
        }
        Collections.reverse(vowelList);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (vowelSet.contains(arr[i])) {
                arr[i] = vowelList.get(index);
                index++;
            }
        }
        return new String(arr);
    }
}


