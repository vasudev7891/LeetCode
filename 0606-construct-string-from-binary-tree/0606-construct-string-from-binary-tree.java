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
    StringBuilder sb = new StringBuilder();

    public String tree2str(TreeNode root) {
        build(root);
        return sb.toString();
    }

    private void build(TreeNode root) {
        if(root == null) return;

        sb.append(root.val);

        if(root.left != null || root.right != null) sb.append("(");
        
        build(root.left);

        if(root.left != null || root.right != null) sb.append(")");

        if(root.right != null) sb.append("(");
        
        build(root.right);

        if(root.right != null) sb.append(")");
    }
}