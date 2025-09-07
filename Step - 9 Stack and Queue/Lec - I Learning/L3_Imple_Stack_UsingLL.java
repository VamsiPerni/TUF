// -------------------------------------------------------------------------------------

// Method - I :- Implementation of Stack Using LinkedList

// Time Complexity :- O(1)  , push,pop,size,top = O(1)
// Space Comlpexity :- O()  // the space complexity is not constant here because we are using LinkedList here

import java.util.*;

class stackNode {
    int data;
    stackNode next;

    stackNode(int data) {
        this.data = data;
        this.next = null;
    }

}

public class L3_Imple_Stack_UsingLL {
    static int size = 0;

    public static stackNode stackPush(stackNode top, int val) {
        System.out.println("\n---PUSH Successfull---\n");

        if (top == null) {
            size++;
            return new stackNode(val);
        }

        stackNode newNode = new stackNode(val);
        newNode.next = top;
        top = newNode;
        size++;

        return top;
    }

    public static stackNode stackPop(stackNode top) {
        if (top == null) {
            System.out.println("\n---NO ELEMENTS TO POP---");
            return top;
        }

        System.out.println("\n---POP Successfull---\n");
        stackNode temp = top;
        top = top.next;
        temp.next = null;

        size--;

        return top;
    }

    public static void size() {
        System.out.println("\n---SIZE : " + size + "---\n");
        return;
    }

    public static void top(stackNode top) {
        if (top == null) {
            System.out.println("\n---NO ELEMENTS TO SHOW---");
            return;
        }

        System.out.println("\n---TOP : " + top.data + "---\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackNode top = null;

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
                    top = stackPush(top, ele);
                    break;
                }
                case 2: {
                    top = stackPop(top);
                    break;
                }
                case 3: {
                    size();
                    break;
                }
                case 4: {
                    top(top);
                    break;
                }
            }

        }
        sc.close();
    }
}
