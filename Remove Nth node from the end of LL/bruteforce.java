
class Node {
    public int data;
    public Node next;

    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    public Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Main {
    // Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node DeleteNthNodefromEnd(Node head, int N) {
        if (head == null) {
            return null;
        }
        int cnt = 0;
        Node temp = head;

        // Count the number of nodes in the linked list
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        if (cnt == N) {
            Node newhead = head.next;
            head = null;
            return newhead;
        }

        int res = cnt - N;
        temp = head;
        while (temp != null) {
            res--;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}

