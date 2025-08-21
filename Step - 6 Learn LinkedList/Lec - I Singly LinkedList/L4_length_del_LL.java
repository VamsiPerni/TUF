
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

public class L4_length_del_LL {

    // array to LinkedList
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

    // Traversal of LinekedList
    public static void traversalLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    // Length of the LinkedList
    public static int length(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // search element in LinkedList
    public static void searchElement(Node head, int search) {

        boolean flag = false;
        Node temp = head;

        while (temp != null) {
            if (temp.data == search) {
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag) {
            System.out.println("Element FOUND in LL");
        } else {
            System.out.println("Element NOT FOUND in LL");
        }

        return;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3 };

        Node head = arr2LL(arr);
        traversalLL(head);
        System.out.println("\nLength og the LinkedList is : " + length(head));

        int search1 = 5;
        searchElement(head, search1);

        int search2 = 4;
        searchElement(head, search2);

    }
}
