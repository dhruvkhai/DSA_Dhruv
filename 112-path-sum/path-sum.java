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
    public boolean hasPathSum(TreeNode root, int target) {
        if(root == null) return false;

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sumpath = new Stack<>();

        path.push(root);
        sumpath.push(root.val);
        
        while(!path.isEmpty()){
            TreeNode temp = path.pop();
            int tempval = sumpath.pop();

            if(temp.left == null && temp.right == null && tempval == target)
                return true;

            if(temp.left != null){
                path.push(temp.left);
                sumpath.push(temp.left.val + tempval);
            }

            if(temp.right != null){
                path.push(temp.right);
                sumpath.push(temp.right.val + tempval);
            }    
        }
        return false;
    }
}