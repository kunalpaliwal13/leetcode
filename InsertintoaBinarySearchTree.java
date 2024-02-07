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
    public void solution(TreeNode root , int val){
        if(root==null){return;}
        
        if(root.val< val){
            
            if(root.right!=null){solution(root.right, val);}
            else{root.right = new TreeNode(val); return;}
        }
        if(root.val> val){

            if(root.left!=null){solution(root.left, val);}
            else{root.left = new TreeNode(val); return;}
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root ==null){root = new TreeNode(val); return root;}
        
        solution(root, val);

        return root;
    }
}