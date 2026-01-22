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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        int sum = 0;
        int i = 0;
        for(i = 0 ; i < list.size(); i++){
            if(list.get(i) == low){
                sum += low;
                i++;
                break;
            }
        }
        while(list.get(i) != high && i < list.size()){
            sum += list.get(i);
            i++;
        }
        sum += high;
        return sum;
    }
    public void helper(TreeNode root, List<Integer> ans){
        if(root == null) return;
        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);
    }
}