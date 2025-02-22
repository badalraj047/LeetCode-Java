// This Problem contains my solution to the [LeetCode "21028. Recover a Tree From Preorder Traversal" problem] - https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).


// 1028. Recover a Tree From Preorder Traversal
// Problem Statement:

// We run a preorder depth-first search (DFS) on the root of a binary tree.
// At each node in this traversal, we output D dashes (where D is the depth of this node), then we output the value of this node.  If the depth of a node is D, the depth of its immediate child is D + 1.  The depth of the root node is 0.
// If a node has only one child, that child is guaranteed to be the left child.
// Given the output traversal of this traversal, recover the tree and return its root.

// Example 1:
// Input: traversal = "1-2--3--4-5--6--7"
// Output: [1,2,5,3,4,6,7]

// Example 2:
// Input: traversal = "1-2--3---4-5--6---7"
// Output: [1,2,5,3,null,6,null,4,null,7]
  
// Example 3:
// Input: traversal = "1-401--349---90--88"
// Output: [1,401,null,349,88,90]

// Constraints:

// The number of nodes in the original tree is in the range [1, 1000].
// 1 <= Node.val <= 109

// Solution:

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        return buildTree(traversal, 0);
    }
    private TreeNode buildTree(String traversal, int depth) {
        if (index >= traversal.length()) {
            return null;
        }

        int currentDepth = 0;
        while (index + currentDepth < traversal.length() && traversal.charAt(index + currentDepth) == '-') {
            currentDepth++;
        }

        if (currentDepth != depth) {
            return null;
        }

        int start = index + currentDepth;
        int end = start;
        while (end < traversal.length() && Character.isDigit(traversal.charAt(end))) {
            end++;
        }
        int val = Integer.parseInt(traversal.substring(start, end));
        index = end;

        TreeNode node = new TreeNode(val);

        node.left = buildTree(traversal, depth + 1);
        node.right = buildTree(traversal, depth + 1);

        return node;
    }
}

