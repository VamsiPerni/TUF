// ------------------------------------------------------------------------------------
//  Desc :- Implementation of Binary to Decimal
// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :- 
// Space Comlpexity :- 

// import java.util.*; // TRIED - SELF 

// public class _2_Binary_to_Decimal {

//     public static int b2D(String str) {
//         int res = 0;
//         int pow = 0;
//         int val = 0;

//         for (int i = str.length() - 1; i >= 0; i--) {
//             int temp = str.charAt(i);

//             if (temp == 49) {
//                 val = 1;
//             } else {
//                 val = 0;
//             }

//             res = res + (val * (int) Math.pow(2, pow));
//             pow++;
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         // b2D(str);
//         System.out.println(b2D(str));

//         sc.close();
//     }
// }

// ------------------------------------------------------------------------------------
//  Desc :- Implementation of Binary to Decimal
// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :- O(length_of_the_String)
// Space Comlpexity :- O(1)

import java.util.*; // TUF

public class _2_Binary_to_Decimal {

    public static int b2D(String str) {
        int num = 0, pow = 1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                num = num + pow;
            }
            pow = pow * 2;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // b2D(str);
        System.out.println(b2D(str));

        sc.close();
    }
}
