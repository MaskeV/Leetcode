class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(-1);
      ListNode res = dummy;

      int carry =0;

      while(l1!=null && l2!=null){

        int sum = l1.val+l2.val+carry;
        dummy.next = new ListNode(sum%10);
        carry = sum/10;
        l1 = l1.next;
        l2 = l2.next;

        dummy = dummy.next;

      }     

      while(l1!=null){
        int sum = l1.val+carry;
        dummy.next = new ListNode(sum%10);
        l1 = l1.next;
        carry = sum/10;
        dummy = dummy.next;

      }

      while(l2!=null){
        int sum = l2.val+carry;
        dummy.next = new ListNode(sum%10);
        carry = sum/10;
        l2=l2.next;
        dummy=dummy.next;
      }

      while(carry!=0){
        dummy.next = new ListNode(carry%10);
        carry = carry/10;
        dummy = dummy.next;
      }

      return res.next;
    }
}