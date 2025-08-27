/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode mover = head;
        List<Integer> arr = new ArrayList<>();
        while(mover!=null){
            arr.add(mover.val);
            mover = mover.next;
        }
        int max=0;
        int n = arr.size();

        for(int i=0;i<n/2;i++){
            int sum = arr.get(i) + arr.get(n-1-i);
            max = Math.max(sum,max);   
        }
        
        return max;
    }
}