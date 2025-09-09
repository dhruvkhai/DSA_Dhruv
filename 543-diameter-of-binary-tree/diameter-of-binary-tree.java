/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    // Helper: returns the depth of a node
    private int depth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        // Path through this node = leftDepth + rightDepth
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return height of subtree
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
