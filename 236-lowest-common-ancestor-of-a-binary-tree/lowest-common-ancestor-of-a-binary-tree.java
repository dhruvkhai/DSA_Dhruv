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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p) return p;
        else if(root == q) return q;
        

        TreeNode ln = lowestCommonAncestor(root.left, p , q);
        TreeNode rn = lowestCommonAncestor(root.right, p , q);

        if(ln != null && rn != null) return root;
        else if(ln == null && rn != null) return rn;
        else if(ln != null && rn == null) return ln;
        else return null;
    }
}