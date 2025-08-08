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
    public void printPath(TreeNode root,List<String> list,String str){
        if(root.left == null && root.right == null){
            list.add(str+root.val);
            return;
        }
        if(root.left != null ){
            printPath(root.left,list,str+root.val+"->");            
        }
        if(root.right != null){
            printPath(root.right,list,str+root.val+"->");
        }    
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        String  str="";
        printPath(root,list,str);
        return list;
    }
}