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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
       ListNode mover = head;
       while(mover!=null && mover.next!=null){
        if(mover.next.val==val){
            mover.next=mover.next.next;
        }
        else{
            mover=mover.next;
        }
       }
       return head;
    }
}