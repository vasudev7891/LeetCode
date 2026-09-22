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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(0, nums.length - 1, nums);
    }

    private TreeNode buildTree(int l, int h, int[] nums) {
        if(l > h) return null;

        int mid = l + (h - l) / 2;

        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = buildTree(l, mid - 1, nums);
        curr.right = buildTree(mid + 1, h, nums); 

        return curr;
    }
}