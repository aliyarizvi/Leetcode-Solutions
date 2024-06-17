//By changing links

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class Solution {
    static Node segregate(Node head) {
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        
        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        
        if (oneHead.next != null)
            zero.next = oneHead.next;
        else 
            zero.next = twoHead.next;
        
        one.next = twoHead.next;
        two.next = null;
        
        Node newnode=zeroHead.next;
        return newnode;
    }
}
