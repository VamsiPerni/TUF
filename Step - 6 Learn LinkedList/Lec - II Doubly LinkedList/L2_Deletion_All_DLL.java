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

public class L2_Deletion_All_DLL {
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

    // Delete HEAD of DLL
    public static Node deleteHead(Node head) {

        if (head == null || head.next == null)
            return null;

        head = head.next;
        head.prev = null;

        return head;
    }

    // Delete HEAD of DLL
    public static Node deleteTail(Node head) {

        if (head == null || head.next == null)
            return null;

        Node temp = head.next;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        Node del = temp.next;
        temp.next = null;
        del.prev = null;

        return head;
    }

    // TUF - Delete Kth Element of DLL
    public static Node deleteKEle(Node head, int k) {

        // --->> SELF

        // if (head == null || (k == 1 && head.next == null)) {
        // return null;
        // }

        // int count = 1;
        // Node temp = head.next;

        // while (temp.next != null) {
        // count++;

        // if (k == count && temp.next != null) {
        // Node prevTemp = temp.prev;
        // prevTemp.next = temp.next;

        // Node nextTemp = temp.next;
        // nextTemp.prev = temp.prev;

        // temp.prev = null;
        // temp.next = null;
        // return head;
        // }
        // temp = temp.next;
        // }

        // count++;
        // if (k == count) {
        // Node prevTemp = temp.prev;
        // prevTemp.next = temp.next;
        // temp.prev = null;
        // return head;
        // }

        // System.out.println("Enter VALID K to delete");

        // return head;

        // --->> TUF

        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;

            if (k == cnt)
                break;

            temp = temp.next;
        }

        if (cnt != k) {
            System.out.println("Enter VALID K to delete");
            return head;
        }

        Node tempPrev = temp.prev;
        Node tempNext = temp.next;

        if (tempPrev == null && tempNext == null) {
            return null;
        } else if (tempPrev == null) {
            head = deleteHead(head);
            return head;
        } else if (tempNext == null) {
            head = deleteTail(head);
        } else {
            tempPrev.next = temp.next;
            tempNext.prev = temp.prev;

            temp.next = null;
            temp.prev = null;
        }

        return head;
    }

    // TUF/SELF , - Delete given VALUE Node from DLL
    public static Node deleteValue(Node head, int val) {

        if (head == null) {
            return null;
        }

        Node temp = head;
        int posCnt = 0;

        while (temp != null) {
            posCnt++;
            if (val == temp.data) {
                break;
            }
            temp = temp.next;
        }

        head = deleteKEle(head, posCnt);

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        while (sc.hasNextInt()) {
            int val = sc.nextInt();

            if (val == -1)
                break;

            head = insertTail(head, val);
        }
        System.out.println("After Head insertion LL");
        display(head);
        // System.out.println("After Head insertion REVERSE LL");
        // displayRever(head);

        // --> Delete HEAD of DLL , TC:- 1,2

        // head = deleteHead(head);
        // System.out.println("After Delete HEAD in LL");
        // display(head);
        // System.out.println("REVERSE , After Delete HEAD in LL");
        // displayRever(head);

        // --> Delete TAIL of DLL , TC:- 1,2

        // head = deleteTail(head);
        // System.out.println("After Delete TAIL in LL");
        // display(head);
        // System.out.println("REVERSE , After Delete TAIL in LL");
        // displayRever(head);

        // --> Delete Kth Element from DLL , TC:- 3,4,5,6

        // int k = sc.nextInt();
        // head = deleteKEle(head, k);
        // System.out.println("After Delete Kth in LL");
        // display(head);
        // System.out.println("REVERSE , After Delete Kth in LL");
        // displayRever(head);

        // --> Delete given VALUE node from DLL , TC:- 7,8,9,10

        int val = sc.nextInt();
        head = deleteValue(head, val);
        System.out.println("After Delete VALUE in LL");
        display(head);
        System.out.println("REVERSE , After Delete VALUE in LL");
        displayRever(head);

        sc.close();
    }
}
