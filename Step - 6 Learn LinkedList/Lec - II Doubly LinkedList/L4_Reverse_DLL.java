
// -------------------------------------------------------------------------------------

//  Desc :- Reverse a Doubly LinkedList

// Method - I :- Brute Force Method , By usign extra STACK data structure and solving the problem

// Time Complexity :- O(n) + O(n) => O(2n)
// Space Comlpexity :- O(n)

// import java.util.*;

// class Node {
//     int data;
//     Node prev;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.prev = null;
//         this.next = null;
//     }

//     Node(int data, Node prev, Node next) {
//         this.data = data;
//         this.prev = prev;
//         this.next = next;
//     }
// }

// public class L4_Reverse_DLL {

//     // Display DLL
//     public static void display(Node head) {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }

//         System.out.println();

//         return;
//     }

//     // display reverse DLL
//     public static void displayRever(Node head) {
//         if (head == null) {
//             return;
//         }

//         Node temp = head;

//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         while (temp != null) {
//             System.out.print(temp.data + " <- ");
//             temp = temp.prev;
//         }

//         System.out.println();

//     }

//     // Insert at TAIL DLL
//     public static Node insertTail(Node head, int val) {

//         if (head == null) {
//             return new Node(val);
//         }

//         Node temp = head;

//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         Node newNode = new Node(val, temp, null);
//         temp.next = newNode;

//         return head;
//     }

//     // Reverse a DLL - USING STACK Data Strucutre
//     public static Node reverseDLL(Node head) {
//         Stack<Integer> stack = new Stack<>();

//         Node temp = head;

//         while (temp != null) {
//             stack.push(temp.data);
//             temp = temp.next;
//         }

//         Node temp1 = head;

//         while (temp1 != null) {
//             temp1.data = stack.pop();
//             temp1 = temp1.next;
//         }

//         return head;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Node head = null;
//         while (sc.hasNextInt()) {
//             int val = sc.nextInt();

//             if (val == -1) {
//                 break;
//             }
//             head = insertTail(head, val);
//         }
//         System.out.println("Given LL : ");
//         display(head);

//         // ---> Reverse a DLL
//         head = reverseDLL(head);
//         System.out.println("After , REVERSE LinkedList : ");
//         display(head);

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------

//  Desc :- Reverse a Doubly LinkedList

// Method - I :- Optimal Approach , Without using Extra Data Structure/More Variables (one pass solution)

// Time Complexity :- O(N)
// Space Comlpexity :- O(1)

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

public class L4_Reverse_DLL {

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

    // Reverse a DLL - Optimal Solution
    public static Node reverseDLL(Node head) {
        Node current = head;
        Node tempPrev = null;

        while (current != null) {
            tempPrev = current.prev;
            current.prev = current.next;
            current.next = tempPrev;

            current = current.prev;
        }

        return tempPrev.prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        while (sc.hasNextInt()) {
            int val = sc.nextInt();

            if (val == -1) {
                break;
            }
            head = insertTail(head, val);
        }
        System.out.println("Given LL : ");
        display(head);

        // ---> Reverse a DLL
        head = reverseDLL(head);
        System.out.println("After , REVERSE LinkedList : ");
        display(head);

        sc.close();
    }
}