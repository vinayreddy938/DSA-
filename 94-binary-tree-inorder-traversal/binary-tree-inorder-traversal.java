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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans  = new ArrayList<>();
        traverse(root,ans);
        return ans;
        
    } 
    public static void traverse(TreeNode currentNode,List<Integer> ans){
        if(currentNode==null) return;
        traverse(currentNode.left,ans);
        ans.add(currentNode.val);
        traverse(currentNode.right,ans);

    }
}