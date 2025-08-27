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
//     public int pairSum(ListNode head) {
//         ListNode mover = head;
//         List<Integer> arr = new ArrayList<>();
//         while(mover!=null){
//             arr.add(mover.val);
//             mover = mover.next;
//         }
//         int max=0;
//         int n = arr.size();

//         for(int i=0;i<n/2;i++){
//             int sum = arr.get(i) + arr.get(n-1-i);
//             max = Math.max(sum,max);   
//         }
        
//         return max;
//     }
// }

class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow;
        ListNode prev = null;
        ListNode pres=mid;
        ListNode next = mid.next;
        while(pres!=null){
            pres.next =prev;
            prev=pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
        int max=0;
        while(prev!=null){
            int sum = head.val + prev.val;
            max = Math.max(sum,max);
            head = head.next;
            prev = prev.next;
        }
        return max;
    }
}