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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        TreeNode node = root;
        reccPostorder(node, arr);
        return arr;    
    }

    public void reccPostorder(TreeNode node, List<Integer> arr){
        if(node == null) return;

        reccPostorder(node.left,arr);
        reccPostorder(node.right,arr);
        arr.add(node.val);
    }
}