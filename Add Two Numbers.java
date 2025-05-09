// This Problem contains my solution to the [LeetCode "2. Add Two Numbers" problem] - https://leetcode.com/problems/add-two-numbers/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 2. Add Two Numbers
// Problem Statement:

// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Example 1:

// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
// Example 2:

// Input: l1 = [0], l2 = [0]
// Output: [0]
// Example 3:

// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]

// Constraints:

// The number of nodes in each linked list is in the range [1, 100].
// 0 <= Node.val <= 9
// It is guaranteed that the list represents a number that does not have leading zeros.

// Solution: 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(-1);
        ListNode l3Start = l3;
        int carry = 0;
        while (l1 != null || l2 != null){
            int l1Val = 0;            
            if (l1 != null) {
                l1Val = l1.val;
                l1 = l1.next;
            }
            int l2Val = 0;
            if (l2 != null){
                l2Val = l2.val;
                l2 = l2.next;
            }
            int value = l1Val + l2Val + carry;            
            l3.next = new ListNode(value % 10);
            carry = value / 10; 
            l3 = l3.next;
        }
        if (carry != 0){
            l3.next = new ListNode(carry);
        }
        return l3Start.next;
    }
}
