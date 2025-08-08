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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode join = new ListNode();
      ListNode start = join;
      int prev=0;
      while(l1!=null && l2!=null){
       
       if(prev<10){
        start.next=new ListNode((l1.val+l2.val)%10);
        prev = l1.val+l2.val;
       }else{
        start.next=new ListNode((((l1.val+l2.val)%10)+(prev/10))%10);
        prev = l1.val+l2.val+(prev/10);
       }
         
 
        l1=l1.next;
        l2=l2.next;
        start = start.next;
      }
      while(l1!=null){ 
       if(prev<10){
        start.next=new ListNode((l1.val)%10);
        prev=l1.val;
       }else{
        start.next=new ListNode((((l1.val)%10)+(prev/10))%10);
        prev =l1.val+prev/10;
       }
       start = start.next;
       l1=l1.next;
  
      }
         while(l2!=null){ 
       if(prev<10){
        start.next=new ListNode((l2.val)%10);
        prev=l2.val;
       }else{
        start.next=new ListNode((((l2.val)%10)+(prev/10))%10);
        prev =l2.val+prev/10;
       }
       start=start.next;
       l2=l2.next;
  
      }
      
      if(prev>=10){
        start.next = new ListNode(prev/10);
      }
   
    
       return join.next; 
    }
}