// -------------------------------------------------------------------------------------

// Method - I :- Implementation of Stack using Arrays

// Time Complexity :- O(1)
// Space Comlpexity :- O(10) , beacuse here we are using arrays with some constant size , it is not in dynamic in nature

import java.util.Scanner;

class L1_Imple_Stack_UsingArrays {
    public static int stackPush(int[] stack, int top, int n, int val) {
        if (top >= n) {
            System.out.println("----Stack is FULL----");
            return n;
        }

        top = top + 1;
        stack[top] = val;
        System.out.println("----Element Pushed Successfully----\n");

        return top;
    }

    public static int stackPop(int top) {
        if (top == -1) {
            System.out.println("\n---NO Elements to POP----\n");
            return -1;
        }

        top = top - 1;
        System.out.println("\n----POP Successfull----\n");
        return top;
    }

    public static void stackSize(int top) {
        System.out.println("\n----Size() : " + (top + 1) + "----\n");
    }

    public static void stackTop(int[] stack, int top) {
        if (top == -1) {
            System.out.println("\n----NO ELEMENTS----\n");
            return;
        }

        System.out.println("\n---Top() is : " + stack[top] + "---\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stack[] = new int[10];
        int n = stack.length;
        int top = -1;

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
                    top = stackPush(stack, top, n, ele);
                    break;
                }
                case 2: {
                    top = stackPop(top);
                    break;
                }
                case 3: {
                    stackSize(top);
                    break;
                }
                case 4: {
                    stackTop(stack, top);
                    break;
                }
            }

        }

        sc.close();
    }
}