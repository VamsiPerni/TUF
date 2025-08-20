// package Step - 6 Learn LinkedList.Lec - I Singly LinkedList;

// Basic Implementation of linkedList for only one element without any head / tail  

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

public class L1_basic_implementation {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 9 };

        Node node = new Node(arr[2]);
        System.out.println(node.data);

    }
}
