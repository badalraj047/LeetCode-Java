// This Problem contains my solution to the [LeetCode "889. Construct Binary Tree from Preorder and Postorder Traversal" problem] - https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 889. Construct Binary Tree from Preorder and Postorder Traversal
// Problem Statement:

// Given two integer arrays, preorder and postorder where preorder is the preorder traversal of a binary tree of distinct values and postorder is the postorder traversal of the same tree, reconstruct and return the binary tree.
// If there exist multiple answers, you can return any of them.

// Example 1:

// Input: preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
// Output: [1,2,3,4,5,6,7]
  
// Example 2:
// Input: preorder = [1], postorder = [1]
// Output: [1]

// Constraints:

// 1 <= preorder.length <= 30
// 1 <= preorder[i] <= preorder.length
// All the values of preorder are unique.
// postorder.length == preorder.length
// 1 <= postorder[i] <= postorder.length
// All the values of postorder are unique.
// It is guaranteed that preorder and postorder are the preorder traversal and postorder traversal of the same binary tree.

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
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    private TreeNode buildTree(int ps, int os, int pe, int[] pre, int[] post, Map<Integer, Integer> mp) {
        if (ps > pe) {
            return null;
        }

        TreeNode root = new TreeNode(pre[ps]);
        if (ps == pe) {
            return root;
        }

        int left = pre[ps + 1];
        int idx = mp.get(left);
        int sz = idx - os + 1;

        root.left = buildTree(ps + 1, os, ps + sz, pre, post, mp);
        root.right = buildTree(ps + sz + 1, idx + 1, pe, pre, post, mp);

        return root;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(postorder[i], i);
        }

        return buildTree(0, 0, n - 1, preorder, postorder, mp);
    }
}


