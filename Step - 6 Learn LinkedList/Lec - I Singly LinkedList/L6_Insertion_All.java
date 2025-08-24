
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.next = next;
        this.data = data;
    }
}

public class L6_Insertion_All {

    // Display SLL
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        return;
    }

    // Insert at head/begining of LL
    public static Node insertHead(Node head, int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        head = newNode;
        head.next = temp;

        return head;
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

    // TUF - Insert at given {kth} position (1 to n+1 we can insert , otherwise we
    // need to print something)
    public static Node insertAtK(Node head, int k, int val) {

        // SELF - Not Optimal
        // int flag = -1;

        // if (head == null && k == 1) {
        // flag = 1;
        // return new Node(val);
        // }

        // Node newNode = new Node(val);

        // if (k == 1) {
        // Node temp = head;
        // head = newNode;
        // head.next = temp;
        // return head;
        // }

        // int count = 1;
        // Node prev = head;
        // Node temp = head.next;

        // while (temp != null) {
        // count++;

        // if (k == count) {
        // newNode.next = prev.next;
        // prev.next = newNode;
        // return head;
        // }

        // prev = temp;
        // temp = temp.next;
        // }

        // count++;
        // if (count == k) {
        // prev.next = newNode;
        // return head;
        // }

        // if (flag == -1) {
        // System.out.println("Enter the valid position");
        // }

        // return head;

        // TUF - Optimal Solution

        int flag = -1;

        if (head == null && k == 1) {
            return new Node(val);
        }

        if (k == 1) {
            Node node = new Node(val, head);
            return node;
        }

        int count = 1;
        Node temp = head.next;

        while (temp != null) {
            count++;

            if (k - 1 == count) {
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                return head;
            }

            temp = temp.next;
        }

        if (flag == -1) {
            System.out.println("Enter the valid position");
        }

        return head;
    }

    // TUF - Insert after given value
    public static Node insertFront(Node head, int k, int val) {

        if (head == null) {
            System.out.println("There are NO ELEMENTS in LL");
            return head;
        }

        if (head.data == k) {
            Node newNode = new Node(val, head);
            return newNode;
        }

        int flag = -1;

        // SELF

        // Node prev = head;
        // Node temp = head.next;

        // while (temp != null) {
        // if (temp.data == k) {
        // Node newNode = new Node(val, temp);
        // prev.next = newNode;
        // return head;
        // }

        // prev = temp;
        // temp = temp.next;
        // }

        // TUF - little bit different and optimal
        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == k) {
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }

        if (flag == -1) {
            System.out.println("Entered element NOT FOUND");
        }

        return head;
    }

    // Insert before given value
    public static Node insertBack(Node head, int k, int val) {

        if (head == null) {
            System.out.println("NO ELEMENTS in LL");
            return head;
        }

        if (head.data == k) {
            Node newNode = new Node(val, head.next);
            head.next = newNode;
            return head;
        }

        int flag = -1;
        Node temp = head.next;

        while (temp != null) {
            if (temp.data == k) {
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }

        if (flag == -1) {
            System.out.println("NO ELEMENT FOUND");
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            int val = sc.nextInt();

            if (val == -1)
                break;

            list.add(val);
        }

        // Insert at head/begining of LL TC-1,2
        // for (int i : list) {
        // head = insertHead(head, i);
        // }
        // display(head);

        // Insert at tail/last of LL TC-1,2
        // for (int i : list) {
        // head = insertTail(head, i);
        // }
        // display(head);

        // ---> Insert at kth position of LL , TC-3,4,5,6
        // for (int i : list) {
        // head = insertTail(head, i);
        // }
        // System.out.println("Given LL");
        // display(head);

        // int k = sc.nextInt();
        // int val = sc.nextInt();

        // head = insertAtK(head, k, val);
        // System.out.println("\nAfter kth insertion");
        // display(head);

        // ---> Insert at before element in LL , TC-7,8,9,10

        // for (int i : list) {
        // head = insertTail(head, i);
        // }
        // System.out.println("Given LL");
        // display(head);

        // int k = sc.nextInt();
        // int val = sc.nextInt();

        // head = insertFront(head, k, val);
        // System.out.println("\nInsert BEFORE insertion");
        // display(head);

        // ---> Insert at after element in LL , TC-7,8,9,10

        for (int i : list) {
            head = insertTail(head, i);
        }
        System.out.println("Given LL");
        display(head);

        int k = sc.nextInt();
        int val = sc.nextInt();

        head = insertBack(head, k, val);
        System.out.println("\nInsert AFTER given element");
        display(head);

        sc.close();
    }
}
