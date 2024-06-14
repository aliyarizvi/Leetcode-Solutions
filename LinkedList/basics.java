import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
    
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    public static Node convertARR(int arr[]) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node ptr = head;

        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]); 
            ptr.next = temp;
            ptr = temp;
        }
        return head; 
    }
    
    public static void printLL(Node head){
        Node temp = head; 
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; 
        }
        System.out.println();
    }

    public static int lengthofLL(Node head){
        int count = 0;
        Node temp = head; 
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static Node insert_first(Node head,int k){
        Node temp=new Node(k,head);
        return temp;
    }
    public static Node insert_last(Node head,int k){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newnode=new Node(k);
        temp.next=newnode;
        return head;
    }
    public static Node insertAtPos(Node head,int k,int pos){
        int count=0;
        Node temp=head;
        if(head==null){
            if(pos==1)
            return new Node(k);
        }
        if(pos==1)
        return insert_first(head,k);
        
        else
        
        while(temp!=null){
            count++;
            if(count==(pos-1)){
                Node newnode=new Node(k,temp.next);
                temp.next=newnode;
                break;
            }
            temp=temp.next;
        }
        
        return head;
    }  
}

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Node head = LinkedList.convertARR(arr);
        head=LinkedList.insert_first(head,0);
        head=LinkedList.insert_last(head,6);
        head=LinkedList.insertAtPos(head,2,3);
        LinkedList.printLL(head);
        //System.out.println("Length of linked list: " + LinkedList.lengthofLL(head));
        
    }
}
