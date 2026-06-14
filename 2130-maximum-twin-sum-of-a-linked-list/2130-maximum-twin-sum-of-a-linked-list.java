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
    public int pairSum(ListNode head) {

        int maxtwinSum = 0;
        List<Integer> arr = new ArrayList<>();

        ListNode temp = head;
         while(temp!=null){
            arr.add(temp.val);
            temp =  temp.next;  
         }
         
         int n  = arr.size();
         

         for(int i=0;i<n/2;i++){
            if(arr.get(i)+arr.get(n-i-1)>maxtwinSum){
                maxtwinSum = arr.get(i)+arr.get(n-i-1);
            }
         }

        return maxtwinSum;
    }
}