
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class L1_Arr2DLL {
    // Display SLL
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        return;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i], temp, null);
            temp.next = newNode;
            temp = temp.next;
        }

        display(head);
    }
}
