/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        inorderTraversalRecur(root, res);
        return res;
    }
    
    private void inorderTraversalRecur(TreeNode root, List<Integer> res){
        if(root.left != null){
            inorderTraversalRecur(root.left, res);
        }
        res.add(root.val);
        if(root.right != null){
            inorderTraversalRecur(root.right, res);
        }
    }
}
