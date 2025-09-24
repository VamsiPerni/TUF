// -------------------------------------------------------------------------------------
//  Desc :- Check if the ith bit is set or not 

// Below code steps in detailed understanding ->

// Method - I :- Brute Force Approach 
//  a bit is set if it is 1 else it is NOT set
// 1.By converting it to the decimal to mbinary
// 2.And , finding the ith whether it is set or not 

// Time Complexity :- 
// Space Comlpexity :- 

// import java.util.*; // TRIED - SELF

// public class _4_check_ith_bit_setOrNot {

//     public static String reverseString(String str) {
//         String res = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             res += str.charAt(i);
//         }

//         return res;
//     }

//     public static String d2B(int n) {
//         String res = "";

//         while (n != 1) {
//             if (n % 2 == 1)
//                 res += '1';
//             else
//                 res += '0';

//             n = n / 2;
//         }

//         res += '1';

//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int ith = sc.nextInt();

//         // 1.Convert the number to binary
//         String res = d2B(num);

//         // 2.Check the ith set and return the value

//         boolean ans = ith <= res.length() && res.charAt(ith) == '1' ? true : false;
//         System.out.println(ans);

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// Desc :- Check if the ith bit is set or not

// Below code steps in detailed understanding ->

// Method - I :- Better Approach (by using Left Shift operator OR Right shift operator)

// Time Complexity :-
// Space Comlpexity :-

import java.util.*; // TUF

public class _4_check_ith_bit_setOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ith = sc.nextInt();

        // 1.Using LEFT Shift Operator

        // if ((num & (1 << ith)) != 0) {
        // System.out.print(true);
        // } else
        // System.out.print(false);

        // 2.Using RIGHT Shift Operator

        if ((1 & (num >> ith)) != 0) {
            System.out.print(true);
        } else
            System.out.print(false);

        sc.close();
    }
}
