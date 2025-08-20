// -------------------------------------------------------------------------------------

import java.util.*;

public class L1_Basic_to_SLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(1);
        list.insertLast(99);

        list.display();

        sc.close();
    }
}