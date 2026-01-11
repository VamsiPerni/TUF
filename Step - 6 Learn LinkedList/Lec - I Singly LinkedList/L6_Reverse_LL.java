// Reverse a Singly LinkedList

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class L6_Reverse_LL {
    public static void arr2LL(int[] arr, Node head) {
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            mover.next = newNode;
            mover = newNode;
        }
    }

    public static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverseLL(Node head) {

        Node prevNode = null;
        Node currentNode = head;
        Node nextNode = head;

        while (nextNode != null) {
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        Node head = new Node(arr[0]);

        arr2LL(arr, head);

        printLL(head);

        // Reverse a LL
        head = reverseLL(head);

        printLL(head);
    }
}
