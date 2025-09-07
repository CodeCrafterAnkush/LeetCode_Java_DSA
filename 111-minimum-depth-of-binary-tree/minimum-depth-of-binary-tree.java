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
    public int minDepth(TreeNode root) {
        if(root == null)return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int defth =1;
        
        while(!q.isEmpty()){
            int levels = q.size();
            for(int i=0;i<levels;i++){
                TreeNode currNode = q.remove();
                if(currNode.left == null && currNode.right == null)return defth;
                if(currNode.left != null)q.add(currNode.left);
                if(currNode.right != null)q.add(currNode.right);
            }
            defth++;
        }
        return defth;
    }
}