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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> wraplist = new ArrayList<>();
        if(root == null) return wraplist;

        q.offer(root);
        while(!q.isEmpty()){
            int levelnum = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i = 0 ; i < levelnum ; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                TreeNode node = q.poll();
                sublist.add(node.val); 
            }
            wraplist.add(sublist);
        }
        return wraplist;
    }
}