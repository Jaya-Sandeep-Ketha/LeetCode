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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelorderrecursive(root, 0, result);
        return result;
    }
    private static void levelorderrecursive(TreeNode root, int level, List<List<Integer>>result){
        if(root==null){
            return;
        }
        if(result.size()==level){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            result.add(list);
        }
        else{
            result.get(level).add(root.val);
        }
        levelorderrecursive(root.left, level+1, result);
        levelorderrecursive(root.right, level+1, result);
    }
}