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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> s1 = new ArrayList<>(), s2 = new ArrayList<>();
        dfs(root1, s1);
        dfs(root2, s2);
        return s1.equals(s2);
    }
    public void dfs(TreeNode root, List<Integer> s)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            s.add(root.val);
        dfs(root.left, s);
        dfs(root.right, s);
    }
}