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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode temp = head;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp .val,0)+1);
            temp=temp.next;
        }

        temp=head;
        ListNode prev = null;
        while(temp!=null){
             if(map.get(temp.val)>1 && prev==null){
             head= temp.next;
            }
            else if(map.get(temp.val)>1){
             prev.next=temp.next;
           }else{
            prev=temp;
           }

                temp=temp.next;
        }
       return head;
    }
}