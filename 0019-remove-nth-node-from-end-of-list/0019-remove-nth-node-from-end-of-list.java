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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode res = new ListNode(0,head);
//         ListNode dummy = res;

//         for(int i=0;i<n;i++){
//             head=head.next;
//         }

//         while(head!=null){
//             head=head.next;
//             dummy = dummy.next;
//         }
//        dummy.next=dummy.next.next;
//        return res.next;
//     }
// }


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
         if(length==1){
            return null;
        }if(length==n){
            return head.next;
        }
        for(int i=0;i<length-n-1;i++){
         temp=temp.next;
        }
        if(temp.next!=null){
        temp.next=temp.next.next;
        }
       
        return head;
    }
}