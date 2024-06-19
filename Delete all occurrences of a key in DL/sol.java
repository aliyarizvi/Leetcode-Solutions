class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                if(temp==head){
                    head=temp.next;
                }
                Node nextnode=temp.next;
                Node prevnode=temp.prev;
                
                if(nextnode!=null)
                nextnode.prev=prevnode;
                if(prevnode!=null)
                prevnode.next=nextnode;
                
                temp=temp.next;
            }
            else
            temp=temp.next;
        }
        return head;
    }
}
