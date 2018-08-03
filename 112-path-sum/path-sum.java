// Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
// Note: A leaf is a node with no children.
//
// Example:
//
// Given the below binary tree and sum = 22,
//
//
//       5
//      / \
//     4   8
//    /   / \
//   11  13  4
//  /  \      \
// 7    2      1
//
//
// return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        ArrayList<Integer> result=hasPathSum(root,0,new ArrayList<Integer>());
        if (result.contains(sum)){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Integer> hasPathSum(TreeNode root, int rootsum, ArrayList<Integer> cute){
        if(root.left==null&&root.right==null){
            rootsum=rootsum+root.val;
            cute.add(rootsum);
        }else{
            rootsum=rootsum+root.val;
            if(root.left!=null){
            hasPathSum(root.left, rootsum, cute);
            }
            if(root.right!=null){
            hasPathSum(root.right, rootsum, cute);
            }
        }
        return cute;
    }
}
