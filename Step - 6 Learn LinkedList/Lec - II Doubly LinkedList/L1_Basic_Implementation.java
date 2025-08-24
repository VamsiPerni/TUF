
import java.util.*;

public class L1_Basic_Implementation {

    // Display SLL
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        return;
    }

    // Insert at tail/end of LL
    public static Node insertTail(Node head, int val) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int val = sc.nextInt();

            if (val == -1) {
                break;
            }
        }

        sc.close();
    }
}
