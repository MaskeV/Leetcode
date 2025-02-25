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
    public ListNode oddEvenList(ListNode head) {
        // ListNode temp=head;
        // ListNode even = new ListNode(-1);
        // ListNode even = new ListNode(-1);
        // ListNode ans = new ListNode(-1);
        // while(temp.next!=null){
        //     if(temp.data%2==0){
        //         even.data=temp.data;
        //         even.next=temp;



        //     }else{
        //         odd.data=temp.data;
        //         odd.next=temp;
        //     }
        //     temp=temp.next;
            
        // }
        // while(even!=null){
            
            

        // }

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
//     public ListNode oddEvenList(ListNode head) {
//         if (head == null)
//             return null;
//         ListNode first = head,secound = head.next;
//         ListNode even = secound;
//         while (secound != null &&  secound.next != null){
//                 first.next = secound.next;
//                 first = first.next;
//                 secound.next = first.next;
//                 secound = secound.next;
//         }
//         //after iteration we gave first pointer last as secound pointer start
//         first.next = even;
//         // now we return head
//         return head;
//     }
// }
        if(head==null) return null;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode demo=even;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=demo;
        return head;
    }
}