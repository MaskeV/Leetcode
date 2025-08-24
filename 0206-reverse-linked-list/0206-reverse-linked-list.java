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
//     public ListNode reverseList(ListNode head) {
       
        // ArrayList<Integer> arr = new ArrayList<>();
        // while(head!=null){
        //     arr.add(head.val);
        //     head=head.next;
        // }
    
        // Collections.reverse(arr);
        // ListNode rev = new ListNode();
        // ListNode start = rev;
        
        // for(int i : arr){
        //     rev.next = new ListNode(i);
        //     rev = rev.next;
        // }
                                                            
        // return start.next;

        
//         ListNode rev = null;
//         ListNode mover = head;
//         while(mover!=null){
//             ListNode temp = new ListNode(mover.val);
//             temp.next = rev;
//             rev=temp;
//             mover=mover.next;
//              }
//              return rev;
//     }
// }




class Solution{
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode curr = head;
        ListNode next= curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(curr!=null){
                next = next.next;
            }
        }
     return prev;
    
    }
    // ListNode mover = head;
    // ListNode rev = null;
    // while(mover!=null){
    //     ListNode temp = new ListNode(mover.val);
    //     temp.next=rev;
    //     rev = temp;
    //     mover = mover.next;
    // }
    // return rev;
    // }
    
}