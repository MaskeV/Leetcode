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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> first = new ArrayList<>();
        inorder(p,first);
        

        List<Integer> second = new ArrayList<>();
        inorder(q,second);

        if(first.size()!=second.size()){
            return false;
        }
        for(int i=0;i<first.size();i++){
            if(first.get(i)!=second.get(i)){
                return false;
            }
        }
        return true;
    }
    void inorder(TreeNode node,List<Integer> res){
        if(node!=null){
            inorder(node.left,res);
            res.add(node.val);
            inorder(node.right,res);
        }
    }
}