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
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelorder(root, 0, result);
        List<Integer> answer = result.get(result.size() - 1);
        return answer.get(0);
    }
    public static void levelorder(TreeNode root, int level, List<List<Integer>> result){
        if(root==null){
            return;
        }
        if(result.size() == level){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            result.add(list);
        }
        else{
            result.get(level).add(root.val);
        }
        levelorder(root.left, level+1, result);
        levelorder(root.right, level+1, result);
    }
}