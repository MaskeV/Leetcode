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
     public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }
        ListNode mid = slow;
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next = mid.next;

        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)
             next = next.next;
        }
        ListNode temp=head;

        while(temp!=null && prev!=null){
            if(temp.val != prev.val){
                return false;
            }
            temp = temp.next;
            prev=prev.next;
        }
        return true;
     }
 }


 // wrong approaach
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if(head==null || head.next==null){
//             return true;
//         }
//         ListNode rev = new ListNode();
//         rev.next=head;
//         ListNode prev=null;
//         ListNode pres = rev.next;
//         ListNode next = pres.next;
//         while(pres!=null){
//             pres.next=prev;
//             prev=pres;
//             pres=next;
//             if(next!=null){
//                 next=next.next;
//             }
//         }
//         return head.val == prev.val;
//     }
// }