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
    public ListNode removeNthFromEnd(ListNode head, int n) {

       int count =0;

       ListNode temp = head;

       while(temp!=null){
        count++;
        temp = temp.next;
       }

       temp = head;
       int index = count - n;

       while(index>1){
        temp = temp.next;
        index--;
       }

       if(index==0){
        return head.next;
       }

      if(temp!=null && temp.next!=null){
       temp.next = temp.next.next;
      }

       return head;

    }
}