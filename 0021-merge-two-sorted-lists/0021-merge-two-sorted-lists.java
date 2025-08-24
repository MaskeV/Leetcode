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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
             curr.next=list1;
             list1=list1.next;
            }else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        curr.next=list1!=null ? list1:list2;

        return dummy.next;

        // while(list1 !=null){
        //     ans.next=list1;
        //     list1 = list1.next;
        //     ans = ans.next;
        // }
        // while(list2!=null){
        //     ans.next = list2;
        //     list2 = list2.next;
        //     ans = ans.next;
        // }
        // return head.next;

    }
}

// class Solution{
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2){
//         if(l1 == null){
//             return l2;
//         }if(l2 == null){
//             return l1;
//         }if(l1.val<l2.val){
//             l1.next = mergeTwoLists(l1.next,l2);
//             return l1;
//         }else{
//             l2.next = mergeTwoLists(l2.next,l1);
//             return l2;

//         }
        
//     }
// }