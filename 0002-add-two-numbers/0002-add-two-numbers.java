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
class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode join = new ListNode();
        ListNode head = join;
        int carry=0;
        while(l1!=null && l2!=null){
           int sum=l1.val+l2.val+carry;
           join.next=new ListNode(sum%10); 
           carry= sum/10;
           join=join.next;
           l1=l1.next;
           l2=l2.next;
        }
        while(l1!=null){
           int sum=l1.val+carry;
           join.next=new ListNode(sum%10); 
           carry= sum/10;
           join=join.next;
           l1=l1.next;
        }
         while(l2!=null){
            int sum=l2.val+carry;
           join.next=new ListNode(sum%10); 
           carry= sum/10;
           join=join.next;
           l2=l2.next;
        }
        if(carry!=0){
           join.next=new ListNode(carry);  
        }
        return head.next;
    }
}

// class Solution{
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode join = new ListNode();
//         ListNode mover = join;
//         int total=0,carry=0;

//         while(l1!=null || l2!=null || carry!=0){
//         total=carry;
//             if(l1!=null){
//                 total += l1.val;
//                 l1=l1.next;
//             }if(l2!=null){
//                 total += l2.val;
//                 l2=l2.next;
//             }
//             int num=total%10;
//             carry = total/10;
//             mover.next =  new ListNode(num);
//             mover = mover.next;
//         }
//         return join.next;
//     }
// }