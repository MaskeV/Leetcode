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
    public int getDecimalValue(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode mover = head;
        int ans=0;
        while(mover!=null){
        ans = 2*ans +mover.val;
            mover = mover.next;
        }
        return ans;
    }
}