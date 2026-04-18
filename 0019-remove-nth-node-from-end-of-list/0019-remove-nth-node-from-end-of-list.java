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

        ListNode node = head;

        while(node!=null){
            count++;
            node = node.next;
        }

        int idx = count-n+1;

        if(idx==1){
            return head.next;
        }

       ListNode prev = null;
       node = head;
       int i=1;

       while(i<idx){
            prev = node;
            node = node.next;
            i++;

       }
       
       
       prev.next = node.next;
       
       return head;
    
    }
}