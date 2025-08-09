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
    public List<List<Integer>> ansList = new ArrayList<>();
    public void returnPath(TreeNode root,List<Integer> list, int sum,int target){
        if(root == null)return;
        sum+=root.val;
        list.add(root.val);
        if(root.left == null && root.right == null && sum == target){
            ansList.add(new ArrayList<>(list));
        }        
        returnPath(root.left,list,sum,target);
        returnPath(root.right,list,sum,target);   
        list.remove(list.size() - 1);
    } 
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        returnPath(root,new ArrayList<>(),0,targetSum);
        return ansList;
    }
}