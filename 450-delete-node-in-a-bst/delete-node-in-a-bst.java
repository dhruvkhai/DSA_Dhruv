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
    public TreeNode deleteNode(TreeNode dummy, int key) {
        if(dummy == null) return null;
        if (dummy.val == key) {
            return helper(dummy);
        }
        TreeNode root = dummy;
        while(root != null){
            if(root.val > key){
                if(root.left != null && root.left.val == key){
                    root.left = helper(root.left);
                    break;
                }
                root = root.left;
            }
            else if(root.val < key){
                if(root.right != null && root.right.val == key){
                    root.right = helper(root.right);
                    break;
                }
                root = root.right;
            }
        }
        return dummy;
    }
    public static TreeNode helper(TreeNode root){
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        TreeNode lefttemp = root.left;
        TreeNode righttemp = lastelmt(root.right);
        righttemp.left = lefttemp;
        return root.right;
    }
    public static TreeNode lastelmt(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}