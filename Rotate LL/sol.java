class Solution {
    public ListNode knode(ListNode head,int k){
        int c=1;
        ListNode temp=head;
        while(temp!=null){
            if(c==k)
            break;

            c++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
        return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        if(k%len==0)
        return head;

        k=k%len;
        tail.next=head;
        ListNode newLast= knode(head,(len-k));

        head=newLast.next;
        newLast.next=null;
        return head;
    }
}
