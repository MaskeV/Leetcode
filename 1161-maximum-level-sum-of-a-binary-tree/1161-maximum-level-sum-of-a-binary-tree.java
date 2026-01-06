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
     void levelOrder(TreeNode node,int level,List<List<Integer>> res){
        if(node == null){
            return;
        }

         if(res.size()<=level){
            res.add(new ArrayList());
         }
         res.get(level).add(node.val);
         levelOrder(node.left,level+1,res);
         levelOrder(node.right,level+1,res);


     }

    public int maxLevelSum(TreeNode root) {
      List<List<Integer>> list = new ArrayList<>();
      levelOrder(root,0,list);
       int max=Integer.MIN_VALUE;
       int  level=1;
       int maxLevel=1;
      for(List<Integer> arr : list){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        if(max<sum){
            max=sum;
            maxLevel=level;
        }
          level++;
    }
     return maxLevel;       
    }
}