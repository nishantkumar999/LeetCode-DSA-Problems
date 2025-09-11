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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int hLst = getHeight(root.left);
        int hRst = getHeight(root.right);
        if(Math.abs(hLst - hRst) > 1){
            return false;
        }
        // Recursively check if left and right subtrees are balanced
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int Lst = getHeight(root.left);
        int Rst = getHeight(root.right);
        return Math.max(Lst, Rst) + 1;
    }
}