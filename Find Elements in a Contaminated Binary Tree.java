// This Problem contains my solution to the [LeetCode "1261. Find Elements in a Contaminated Binary Tree" problem] - https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
// To run this code in VS Code, you need to:
// Add a main method to execute the code.
// Ensure your Java setup is correct (JDK installed and configured).

// 1261. Find Elements in a Contaminated Binary Tree
// Problem Statement:

// Given a binary tree with the following rules:
// root.val == 0
// For any treeNode:
// If treeNode.val has a value x and treeNode.left != null, then treeNode.left.val == 2 * x + 1
// If treeNode.val has a value x and treeNode.right != null, then treeNode.right.val == 2 * x + 2
// Now the binary tree is contaminated, which means all treeNode.val have been changed to -1.
// Implement the FindElements class:
// FindElements(TreeNode* root) Initializes the object with a contaminated binary tree and recovers it.
// bool find(int target) Returns true if the target value exists in the recovered binary tree.

// Example 1:
// Input
// ["FindElements","find","find"]
// [[[-1,null,-1]],[1],[2]]
// Output
// [null,false,true]
// Explanation
// FindElements findElements = new FindElements([-1,null,-1]); 
// findElements.find(1); // return False 
// findElements.find(2); // return True 

// Example 2:
// Input
// ["FindElements","find","find","find"]
// [[[-1,-1,-1,-1,-1]],[1],[3],[5]]
// Output
// [null,true,true,false]
// Explanation
// FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
// findElements.find(1); // return True
// findElements.find(3); // return True
// findElements.find(5); // return False

// Example 3:
// Input
// ["FindElements","find","find","find","find"]
// [[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
// Output
// [null,true,false,false,true]
// Explanation
// FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
// findElements.find(2); // return True
// findElements.find(3); // return False
// findElements.find(4); // return False
// findElements.find(5); // return True

// Constraints:

// TreeNode.val == -1
// The height of the binary tree is less than or equal to 20
// The total number of nodes is between [1, 10^4]
// Total calls of find() is between [1, 10^4]
// 0 <= target <= 10^6

// Solution:

class FindElements {
    Set<Integer> st = new HashSet<>();

    private void dfs(TreeNode root, int x) {
        if (root == null)
            return;

        root.val = x;
        st.add(x);
        dfs(root.left, 2 * x + 1);
        dfs(root.right, 2 * x + 2);
    }

    public FindElements(TreeNode root) {
        st.clear();
        dfs(root, 0);
    }

    public boolean find(int target) {
        return st.contains(target);
    }
}

