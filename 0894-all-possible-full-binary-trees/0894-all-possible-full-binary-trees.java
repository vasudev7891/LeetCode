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
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> ans = new ArrayList<>();

        if(n % 2 == 0) return ans;
        if(n == 1) {
            ans.add(new TreeNode(0));
            return ans;
        }

        for(int left = 1; left < n; left += 2) {
            int right = n - left - 1;

            List<TreeNode> leftSide = allPossibleFBT(left);
            List<TreeNode> rightSide = allPossibleFBT(right);

            for(TreeNode leftTree : leftSide) {
                for(TreeNode rightTree : rightSide) {
                    TreeNode root = new TreeNode(0);
                    root.left = leftTree;
                    root.right = rightTree;

                    ans.add(root);
                }
            }
        }
        
        return ans;
    }
}