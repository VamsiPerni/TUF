// -------------------------------------------------------------------------------------
//  Desc :- Swapping Two Numbers

// Below code steps in detailed understanding ->

// Method - I :- Brute Force method (by using third variable to store the number and change )

// Time Complexity :- 
// Space Comlpexity :- 

// import java.util.*;

// public class _3_swap_2_numbers {

//     public static void swapNumber(int a, int b) {
//         int temp = a;

//         a = b;
//         b = temp;

//         System.out.println(a + " " + b);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         swapNumber(a, b);

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// Desc :- Swapping Two Numbers

// Below code steps in detailed understanding ->

// Method - I :- Brute Force method (by using third variable to store the number
// and change )

// Time Complexity :-
// Space Comlpexity :-

import java.util.*;

public class _3_swap_2_numbers {

    public static void swapNumber(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        swapNumber(a, b);

        sc.close();
    }
}