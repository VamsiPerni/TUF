
// -------------------------------------------------------------------------------------
// 237. Delete Node in a Linked List (leetcode)
//  Desc :- 

// Method - I :-

// Time Complexity :- 
// Space Comlpexity :- 

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

public class Delete_Node_LL_237 {

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

    // MAIN FUNCTION - TRY IT IN LEETCODE
    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        while (sc.hasNextInt()) {
            int val = sc.nextInt();

            if (val == -1) {
                break;
            }

            head = insertLast(head, val);

        }

        Node del = new Node(sc.nextInt());
        deleteNode(del);

        sc.close();
    }
}
