
import java.util.*;

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

public class L3_Insertion_All_DLL {
    // Display DLL
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println();

        return;
    }

    // display reverse DLL
    public static void displayRever(Node head) {
        if (head == null) {
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.prev;
        }

        System.out.println();

    }

    // Insert at head DLL
    public static Node insertHead(Node head, int val) {

        if (head == null) {
            return new Node(val);
        }

        Node newNode = new Node(val, null, head);
        head.prev = newNode;

        return newNode;
    }

    // Insert at TAIL DLL
    public static Node insertTail(Node head, int val) {

        if (head == null) {
            return new Node(val);
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = new Node(val, temp, null);
        temp.next = newNode;

        return head;
    }

    // Insert at before TAIL DLL
    public static Node insertBeforeTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }

        if (head.next == null) {
            head = insertHead(head, val);
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node tempPrev = temp.prev;
        Node newNode = new Node(val, tempPrev, temp);
        tempPrev.next = newNode;
        temp.prev = newNode;

        return head;
    }

    // TUF - Insert BEFORE Kth Position in DLL
    public static Node insertKBefore(Node head, int val, int k) {

        if (head == null) {
            System.out.println("DLL is EMPTY ");
            return null;
        }

        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;

            if (k == cnt)
                break;
            temp = temp.next;
        }

        if (k != cnt) {
            System.out.println("Entered INVALID Kth Position");
        }

        Node tempPrev = temp.prev;

        if (k == 1) {
            head = insertHead(head, val);
        } else {
            Node newNode = new Node(val, tempPrev, temp);
            tempPrev.next = newNode;
            temp.prev = newNode;
        }

        return head;
    }

    // TUF - Insert before given NODE in DLL
    public static Node insertBeforeNode(Node head, int val, int node) {

        if (head == null) {
            System.out.println("There are NO ELEMENTS in DLL");
            return null;
        }

        Node temp = head;
        int k = 0;

        while (temp != null) {
            k++;
            if (temp.data == node) {
                head = insertKBefore(head, val, k);
                return head;
            }
            temp = temp.next;
        }

        System.out.println("Given node NOT FOUND");

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        // --->> Insert HEAD of LL , TC - 1,2

        // while (sc.hasNextInt()) {
        // int val = sc.nextInt();

        // if (val == -1)
        // break;

        // head = insertHead(head, val);
        // }
        // System.out.println("insertion HEAD DLL");
        // display(head);
        // System.out.println("REVERSE , insert HEAD DLL");
        // displayRever(head);

        // --->> Insert tail of LL , TC - 1,2

        // while (sc.hasNextInt()) {
        // int val = sc.nextInt();

        // if (val == -1)
        // break;

        // head = insertTail(head, val);
        // }
        // System.out.println("insertion TAIL DLL");
        // display(head);
        // System.out.println("REVERSE , insert TAIL DLL");
        // displayRever(head);

        // --->> Insert BEFORE TAIL of DLL , TC - 3,4,5

        // while (sc.hasNextInt()) {
        // int val = sc.nextInt();

        // if (val == -1)
        // break;

        // head = insertTail(head, val);
        // }

        // int val = sc.nextInt();
        // head = insertBeforeTail(head, val);

        // System.out.println("insertion BEFORE TAIL DLL");
        // display(head);
        // System.out.println("REVERSE , BEFORE insert TAIL DLL");
        // displayRever(head);

        // --->> Insert before Kth position of LL , TC - 6,7,8,9

        // while (sc.hasNextInt()) {
        // int val = sc.nextInt();

        // if (val == -1)
        // break;

        // head = insertTail(head, val);
        // }
        // System.out.println("Given LL : ");
        // display(head);

        // int val = sc.nextInt();
        // int k = sc.nextInt();

        // head = insertKBefore(head, val, k);

        // System.out.println("insertion BEFORE Kth DLL");
        // display(head);
        // System.out.println("REVERSE , insertion BEFORE Kth DLL");
        // displayRever(head);

        // --->> Insert before given node in LL , TC - 10 - 13

        while (sc.hasNextInt()) {
            int val = sc.nextInt();

            if (val == -1)
                break;

            head = insertTail(head, val);
        }
        System.out.println("Given LL : ");
        display(head);

        int val = sc.nextInt();
        int node = sc.nextInt();

        head = insertBeforeNode(head, val, node);

        System.out.println("insertion BEFORE node DLL");
        display(head);
        System.out.println("REVERSE , insertion BEFORE node DLL");
        displayRever(head);

        sc.close();
    }
}