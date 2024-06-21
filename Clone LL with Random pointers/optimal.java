class Solution {
    void insert(Node head){
        Node temp=head;
        while(temp!=null){
            Node nextEle=temp.next;
            Node copyEle=new Node(temp.val);
            copyEle.next=nextEle;
            temp.next=copyEle;
            temp=nextEle;
        }
    }
    void connect(Node head){
        Node temp=head;
        while(temp!=null){
        Node copied=temp.next;
        if(temp.random!=null)
        copied.random=temp.random.next;
        else
        copied.random=null;
        temp=temp.next.next;
        }
    }
    Node getList(Node head){
        Node temp=head;
        Node dummy=new Node(-1);
        Node res=dummy;

        while(temp!=null){
            res.next=temp.next;
            res=res.next;

            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        if(head==null)
        return null;
        
        insert(head);
        connect(head);
        return getList(head);
    }
}
