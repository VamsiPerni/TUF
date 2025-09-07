// -------------------------------------------------------------------------------------

// Method - I :-

// Time Complexity :- 
// Space Comlpexity :-

import java.util.Scanner;

class queueNode {
    int data;
    queueNode next;

    queueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class L4_Imple_Queue_UsingLL {
    static int size = 0;

    public static queueNode queuePush(queueNode start, queueNode end, int val) {
        queueNode newNode = new queueNode(val);
        size++;
        System.out.println("\n---PUSH SUCCESSFULL---\n");

        if (start == null && end == null) {
            start = newNode;
            return newNode;
        }

        end.next = newNode;
        end = newNode;

        return end;
    }

    public static queueNode queuePop(queueNode start, queueNode end) {
        if (start == null && end == null) {
            System.out.println("\n---NO ELEMENTS TO POP---\n");
            return start;
        }

        System.out.println("\n---POP SUCCESSFULL---\n");

        queueNode temp = start;

        start = start.next;
        size--;

        temp.next = null;

        if (size == 0) {
            start = end = null;
        }

        return start;
    }

    public static void size() {
        System.out.println("\n---SIZE : " + size + "---\n");
        return;
    }

    public static void top(queueNode start) {

        if (start == null) {
            System.out.println("\n---NO ELEMENTS---\n");
            return;
        }

        System.out.println("\n---TOP : " + start.data + "---\n");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueNode start = null;
        queueNode end = null;

        while (sc.hasNextInt()) {
            System.out.println("Enter the number to do the operation");
            System.out.println("\n0 : to stop \n1 : push() \n2 pop() \n3 : size() \n4 : top()");

            int val = sc.nextInt();

            if (val == 0) {
                System.out.println("\n----Stopped Operations----\n");
                break;
            }

            switch (val) {
                case 1: {
                    System.out.println();
                    int ele = sc.nextInt();
                    if (start == null)
                        start = end = queuePush(start, end, ele);
                    else
                        end = queuePush(start, end, ele);

                    break;
                }
                case 2: {
                    start = queuePop(start, end);
                    break;
                }
                case 3: {
                    size();
                    break;
                }
                case 4: {
                    top(start);
                    break;
                }
            }

        }
        sc.close();
    }
}
