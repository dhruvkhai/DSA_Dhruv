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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        if(root == null) return ans;
        que.offer(root);

        while(!que.isEmpty()){
            int size = que.size();
            boolean flag = true;

            while(size-- > 0){
                TreeNode curr = que.remove();
                if(flag){
                    flag = false;
                    ans.add(curr.val);

                }
                if(curr.right != null) que.offer(curr.right);
                if(curr.left != null) que.offer(curr.left);

            }
        }
        return ans;
    }
}