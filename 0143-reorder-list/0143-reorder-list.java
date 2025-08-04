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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast=fast.next.next;
       }
       ListNode mid = slow;
       ListNode prev = null;
       ListNode curr = mid;
       ListNode next = curr.next;
       while(curr!=null){
        curr.next = prev;
        prev = curr;
        curr = next;
        if(next!=null){
            next = next.next;
        }
       }
     ListNode start = head;
        while(start!=null  && prev!=null){
          
                ListNode temp = start.next;
                start.next= prev;
                start = temp;

                temp= prev.next;
                prev.next = start;
                prev = temp;
                
            
            
        }
        if(start!=null){
            start.next=null;
        }
       
    }
}