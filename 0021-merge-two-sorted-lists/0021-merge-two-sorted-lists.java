/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp = new ListNode(-1);
        ListNode demo = temp;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                demo.next = list2;
                list2 = list2.next;
            } else {
                demo.next = list1;
                list1 = list1.next;
            }
            demo = demo.next;

        }

        if (list1 == null) {
            demo.next = list2;
        }
        if (list2 == null) {
            demo.next = list1;
        }

        return temp.next;

//         ListNode temp = new ListNode(-1);
        
//         while(list1.next!=null && list2.next!=null){
//             if(list1.val>list2.val){
//              temp.next =list2;
//              list2=list2.next;
//             }else{
//                 temp.next=list1;
//                 list1=list1.next;
//             }
//         }
//         if(list1==null){
//             temp.next=list2;

//         }if(list2==null){
//             temp.next=list1;
//         }

        
      
//  return temp.next;         
    }

}