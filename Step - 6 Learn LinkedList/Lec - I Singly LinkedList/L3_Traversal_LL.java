// package Step - 6 Learn LinkedList.Lec - I Singly LinkedList;

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

public class L3_Traversal_LL {
    public static Node arr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node tail = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            tail = newNode;
        }

        return head;
    }

    public static void traversalLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7 };
        Node head = arr2LL(arr);
        traversalLL(head);

    }
}
