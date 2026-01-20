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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        Collections.sort(ans);
        return ans.get(k-1);
    }
    public static void helper(TreeNode root, List<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        helper(root.left, ans);
        helper(root.right, ans);
    }
}