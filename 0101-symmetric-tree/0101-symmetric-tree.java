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
    public boolean isSymmetric(TreeNode root) {
     
     if(root==null){
        return true;
     }
     Queue<TreeNode> q = new LinkedList<>();
     q.offer(root.left);
     q.offer(root.right);

     while(!q.isEmpty()){
        TreeNode left = q.poll();
        TreeNode right = q.poll();

        if(left==null && right==null) continue;
        if(left==null || right==null) return false;
        if(left.val!=right.val) return false;

        q.offer(left.left);
        q.offer(right.right);
        q.offer(left.right);
        q.offer(right.left);
     }
     return true;
    }
}


 //bfs
//  class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         List<Integer> l = new ArrayList<>();
//         Queue<TreeNode> q=new LinkedList<>();
//         q.offer(root);
//         while(!q.isEmpty()){
//             int size=q.size();
            
            
//         TreeNode node = q.poll();
//             l.add(node.val);
//                 if(node.left!=null){
//               q.offer(node.left);
//                 }if(node.right!=null){
//                     q.offer(node.right);
//                 }
            
           
//         }
//          System.out.print(l);
//             return true;
//     }
//  }


//inorder Reversal
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         inorder(root,res);
//         if(res.size()<=1){
//             return true;
//         }
//         if(res.size()%2==0){
//            return false;
//         }
//         int i=0,j=res.size()-1;
//         while(i<j){
//             if(res.get(i)!=res.get(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }

//         return true;
//     }
//     void inorder(TreeNode node,List<Integer> res){
//         if(node!=null){
//             inorder(node.left,res);
//             res.add(node.val);
//             inorder(node.right,res);
//         }
//     }
    
// }