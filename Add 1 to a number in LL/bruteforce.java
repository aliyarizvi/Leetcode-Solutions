class Solution
{
    public static Node reverse(Node head){
        if(head==null || head.next==null)
        return head;
        
        Node newHead=reverse(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
        
    }
    public static Node addOne(Node head) 
    { 
       head=reverse(head);
       int carry=1;
       Node temp=head;
       while(temp!=null){
           temp.data=temp.data+carry;
           if(temp.data<10){
               carry=0;
               break;
           }
           else{
               temp.data=0;
               carry=1;
           }
           temp=temp.next;
       }
       if(carry==1){
        Node newNode=new Node(1);
       head=reverse(head);
       newNode.next=head;
       return newNode;
       }
       head=reverse(head);
       return head;
    }
}
