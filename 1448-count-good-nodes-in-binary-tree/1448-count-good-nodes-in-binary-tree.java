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
    int ans = 0;

    public int goodNodes(TreeNode root) {
        countGood(root, root.val);

        return ans;
    }

    private void countGood(TreeNode root, int max) {
        if(root == null) return;
        if(root.val >= max) ans++;

        countGood(root.left, Math.max(max, root.val));
        countGood(root.right, Math.max(max, root.val));
    }
}