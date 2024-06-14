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
}

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Node head = LinkedList.convertARR(arr);
        LinkedList.printLL(head);
        System.out.println("Length of linked list: " + LinkedList.lengthofLL(head));
        
    }
}
