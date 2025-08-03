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
    public ListNode sortList(ListNode head) {
        List <Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            l.add(temp.val);
            temp = temp.next;

        }
        Collections.sort(l);
         ListNode ans = new ListNode();
         ListNode first = ans;
        for(int i:l){
           ans.next = new ListNode(i);
            ans = ans.next;
        }
        return first.next;
    }
}