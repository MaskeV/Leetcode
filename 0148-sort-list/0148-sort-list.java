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
//     public ListNode sortList(ListNode head) {
//         List <Integer> l = new ArrayList<>();
//         ListNode temp = head;
//         while(temp!=null){
//             l.add(temp.val);
//             temp = temp.next;

//         }
//         Collections.sort(l);
//          ListNode ans = new ListNode();
//          ListNode first = ans;
//         for(int i:l){
//            ans.next = new ListNode(i);
//             ans = ans.next;
//         }
//         return first.next;
//     }
// }

class Solution{
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null)
      return head;
        
        ListNode slow=head,fast=head;
        ListNode prev=null;
        while(fast!=null &&  fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
       prev.next = null;
       ListNode l1 = sortList(head);
       ListNode l2 = sortList(slow);
      return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){

        ListNode ans = new ListNode();
        ListNode start = ans;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                ans.next = l1;
                l1=l1.next;
            }else{
                ans.next = l2;
                l2=l2.next;
            }
            ans = ans.next;
        }
        ans.next = l1!=null ? l1 : l2;
        return start.next;
    }
}
