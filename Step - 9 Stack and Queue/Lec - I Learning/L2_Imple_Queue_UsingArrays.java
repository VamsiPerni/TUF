
// -------------------------------------------------------------------------------------

// Method - I :- Implementation of Queue using Arrays

// Time Complexity :- O(1)    , push , pop , top , size = O(1)
// Space Comlpexity :- O(4) , beacuse here we are using arrays with some constant size , it is not dynamic in nature
// only dis-advantage in array is , it is constant is size so we are moving to the linkedlist which is dynamic in nature

import java.util.Scanner;

class L2_Imple_Queue_UsingArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int queue[] = new int[4];
        int size = queue.length;

        int start = -1, end = -1;
        int curSize = 0;

        while (sc.hasNextInt()) {

            System.out.println("\nEnter the number to do the operation");
            System.out.println("\n0 : to stop \n1 : push() \n2 : pop() \n3 : size() \n4 : top()");
            int val = sc.nextInt();

            if (val == 0) {
                System.out.println("\n----Stopped Operations----\n");
                break;
            }

            switch (val) {
                case 1: {
                    System.out.println();
                    int ele = sc.nextInt();
                    // pushQueue()
                    if (curSize < size) {
                        System.out.println("----PUSH Successfull into QUEUE----");
                        if (start == -1 && end == -1) {
                            start = end = 0;
                            queue[0] = ele;
                            curSize++;
                            break;
                        }

                        end = (end + 1) % size;
                        queue[end] = ele;
                        curSize++;
                    } else {
                        System.out.println("----NO SPACE in QUEUE----");
                    }

                    break;
                }
                case 2: {
                    // popQueue()
                    if (curSize == 0) {
                        System.out.println("\nNo Elements to POP");
                        break;
                    }

                    curSize--;
                    System.out.println("\n---POP() Successfull---");

                    if (curSize == 0) {
                        start = end = -1;
                        break;
                    }

                    start = (start + 1) % size;
                    break;
                }
                case 3: {
                    // sizeQueue()
                    System.out.println("\n---Size of QUEUE : " + curSize + "---");

                    break;
                }
                case 4: {
                    // topQueue()
                    if (start == -1 || end == -1) {
                        System.out.println("---NO ELEMENTS in QUEUE---");
                        break;
                    }

                    System.out.println("\n---Top() : " + queue[start] + "---");

                    break;
                }
            }

        }

        sc.close();
    }
}