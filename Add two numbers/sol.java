class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead= new ListNode(-1);
        ListNode temp= dummyHead;
        ListNode temp1= l1;
        ListNode temp2= l2;
        int carry= 0;

        while (temp1 != null || temp2 != null || carry != 0) {
            int sum= carry;
            if (temp1 != null) {
                sum+= temp1.val;
                temp1= temp1.next;
            }
            if (temp2 != null) {
                sum+= temp2.val;
                temp2= temp2.next;
            }

            ListNode newNode= new ListNode(sum % 10);
            carry= sum / 10;

            temp.next= newNode;
            temp= temp.next;
        }
        return dummyHead.next;
    }
}
