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
    public boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left ==null && right==null) return true;
        if(left == null || right == null) return false;
        if(left.val!=right.val) return false;

        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(right.right, left.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isSymmetricHelp(root.left, root.right) && isSymmetricHelp(root.right, root.left);
        // Stack<TreeNode> s1 = new Stack<>();
        // Stack<TreeNode> s2 = new Stack<>();
        // TreeNode curr1 = root;
        // TreeNode curr2 = root;
        // boolean isSymmetric = true;

        // while(curr1!=null || curr2!=null || !s1.isEmpty() || !s2.isEmpty()){
        //     if(isSymmetric == false) return false;
        //     while(curr1!=null || curr2!=null){
        //         s1.push(curr1);
        //         curr1 = curr1.left;
        //         s2.push(curr2);
        //         curr2 = curr2.right;
        //     }
        //     curr1 = s1.pop();
        //     curr2 = s2.pop();
        //     if(curr1 != null && curr2 != null){

        //     if(curr1.left != null && curr2.right != null){
        //         if(curr1.left.val != curr2.right.val) isSymmetric = false;
        //     }else if(curr1.left == null && curr2.right==null){
        //         isSymmetric = true;
        //     }else{
        //         isSymmetric = false;
        //     }
        //     }

        //     // if(curr1 != null && curr2 != null) continue;
        //     // if(curr1 != null || curr2 != null || curr1.val != curr2.val) return false;
        //     curr1 = curr1.right;
        //     curr2 = curr2.left;
        // }

        // return true;

    }
}