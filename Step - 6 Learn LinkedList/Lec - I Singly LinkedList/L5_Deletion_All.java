import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class L5_Deletion_All {

    // Insert at last
    public static Node insertLast(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Display SLL
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        return;
    }

    // Deletion of head/begining/starting
    public static Node deleteHead(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        head = head.next;

        return head;
    }

    // Deletion of tail/last
    public static Node deleteTail(Node head) {
        Node temp = head;

        if (temp == null || temp.next == null)
            return null;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    // TUF - Delete Kth Element of the LinkedList
    public static Node deleteKElement(Node head, int k) {
        // self
        // Node temp = head;
        // int count = 1;

        // if (head == null || temp.next == null) {
        // return null;
        // }

        // if (k == 1) {
        // head = head.next;
        // return head;
        // }

        // while (temp != null) {

        // if (k == count + 1 && temp.next.next != null) {
        // temp.next = temp.next.next;
        // } else if (k == count + 1) {
        // temp.next = null;
        // }

        // temp = temp.next;
        // count++;
        // }

        // TUF - optimal

        if (head == null)
            return head;

        if (k == 1) {
            head = head.next;
            return head;
        }

        int count = 1;
        Node temp = head.next;
        Node prev = head;

        while (temp != null) {
            count++;

            if (k == count) {
                prev.next = prev.next.next;
                return head;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;

    }

    // TUF - Delete {particular value node} from the Linked List
    public static Node deleteValue(Node head, int val) {

        if (head == null) {
            System.out.println("\nNo elements in LL");
            return head;
        }

        if (head.data == val) {
            head = head.next;
            System.out.println("\nElement deleted successfully\nCurrent list is");
            display(head);
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {

            if (temp.data == val) {
                prev.next = prev.next.next;
                System.out.println("\nElement deleted successfully\nCurrent list is");
                display(head);
                return head;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        System.out.println("Enter numbers to insert in LL , {-1} stop the entering");

        // Insertion till -1 entered
        while (sc.hasNextInt()) {
            int val = sc.nextInt();

            if (val == -1) {
                break;
            }

            head = insertLast(head, val);
        }
        display(head);

        // head delete
        // head = deleteHead(head);
        // System.out.println("\nLL after deletion of head ");
        // display(head);

        // tail delete
        // head = deleteTail(head);
        // System.out.println("\nLL after deletion of TAIL ");
        // display(head);

        // Delete Kth Element of the LinkedList // testcases- 5,6,7
        int k = sc.nextInt();
        head = deleteKElement(head, k);
        System.out.println("\nAfter Deleting {Kth} Element");
        display(head);

        // Delete {particular value node} from the Linked List // testcases- 5,6,7
        // int val = sc.nextInt();
        // head = deleteValue(head, val);

        sc.close();
    }
}
