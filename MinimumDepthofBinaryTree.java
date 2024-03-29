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
    public int minDepth(TreeNode root) {
        int count =0;
        if(root ==null){return 0;}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int lvlsize = queue.size();
            for( int i =0; i< lvlsize; i++){
                TreeNode temp = queue.poll();
                if(temp.left == null && temp.right ==null){return ++count;}
                if(temp.left !=null){queue.offer(temp.left);}
                if(temp.right !=null){queue.offer(temp.right);}
                
            }
            count++;
        }
        return count;
    }
}
