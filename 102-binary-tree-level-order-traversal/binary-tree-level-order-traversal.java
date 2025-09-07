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
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();

        if(root == null){
            return list;
        }
        
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> sublist = new LinkedList<Integer>();
            int levels = q.size();
            for(int n=0; n<levels;n++){
                TreeNode currNode = q.remove();

                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
                sublist.add(currNode.val);
            }

            list.add(sublist);
        }

        return list;
       
    }
}