// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//
// For example:
// Given binary tree [3,9,20,null,null,15,7],
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
//
//
//
// return its bottom-up level order traversal as:
//
// [
//   [15,7],
//   [9,20],
//   [3]
// ]
//
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        levelOrderBottom(root,0,list);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }
        return result;
    }
    private void levelOrderBottom(TreeNode root, int level, List<List<Integer>> list) {
        if(root==null){
            return;
        }
        if(level>=list.size()){
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(root.val);
        levelOrderBottom(root.left,level+1,list);
        levelOrderBottom(root.right,level+1,list);
    }
    
}
