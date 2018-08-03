// Given a binary tree, find its minimum depth.
//
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
// Note: A leaf is a node with no children.
//
// Example:
//
// Given binary tree [3,9,20,null,null,15,7],
//
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
//
// return its minimum depth = 2.
//


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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int[] result=new int[1];
        result[0]=Integer.MAX_VALUE;
        minDepth(root,1,result);
        return result[0];
    }
    public void minDepth(TreeNode root, int depth, int[] result){
        if(root.left==null&&root.right==null){
            if(depth<result[0]){
                result[0]=depth;
            }
        }else{
            if(root.left!=null)
                minDepth(root.left,depth+1,result);
            if(root.right!=null)
                minDepth(root.right,depth+1,result);
        }
    }
}
