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
    List<Integer> rightList = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return rightList;
        }
        rightView(root, 0);
        return rightList;
    }

    private void rightView(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (depth == rightList.size()) {
            rightList.add(node.val);
        }
        rightView(node.right, depth + 1); // Explore the right subtree
        rightView(node.left, depth + 1); // Explore the left subtree
    }
}