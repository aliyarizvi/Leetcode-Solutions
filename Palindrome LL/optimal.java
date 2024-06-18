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

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        ListNode front=null;

        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        if(head==null ||head.next==null)
        return true;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode left=head;
        ListNode right=newHead;

        while(right!=null){
            if(left.val != right.val){
                reverse(newHead);
                return false;
            }
            left=left.next;
            right=right.next;
        }
        reverse(newHead);
        return true;
    }

}
