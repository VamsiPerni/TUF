/*
Write a function solution that, given a three-digit integer N and an integer K, returns the maximum possible three-digit value that can be obtained by performing at most K increases by 1 of any digit in N. 

Examples: 
1. Given N = 512 and k = 10 the function should return 972. 
The result can be obtained by increasing the first digit of N four times and the second digit six times.
2. Given N = 191 and K = 4 the function should return 591. 
    The result can be obtained by increasing first digit of N four times. 
3. Given N = 285 and K = 20 the function should return 999. 
    The result can be obtained by increasing the first digit of N seven times, the second digit once and the third digit four times. 
Assume that: N is an integer within the range [100..999]: K is an integer within the range [0..30]. 

*/

// -------------------------------------------------------------------------------------
// Desc :-

// Below code steps in detailed understanding ->

// Method - I :- Brute Force (Naive Approach)

// Time Complexity :- O(n)
// Space Comlpexity :- O(1) 

// import java.util.Scanner; // TRIED - SELF

// public class Q1_Max_Possible_3_Digit_Number {
//     public static int max3Digit(int n, int k) {

//         int hundreds = n / 100;
//         int tens = (n % 100) / 10;
//         int ones = n % 10;

//         for (int i = k; i > 0; i--) {
//             if (hundreds < 9) {
//                 hundreds++;
//             } else if (tens < 9) {
//                 tens++;
//             } else if (ones < 9) {
//                 ones++;
//             }

//             if (hundreds >= 9 && tens >= 9 && ones >= 9)
//                 break;
//         }

//         return ((hundreds * 100) + (tens * 10) + ones);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = sc.nextInt();

//         System.out.println(max3Digit(n, k));
//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// Desc :-

// Below code steps in detailed understanding ->

// Method - I :- Better Approach

// Time Complexity :- O(1)
// Space Comlpexity :- O(1) 

import java.util.Scanner; // TRIED - SELF

public class Q1_Max_Possible_3_Digit_Number {
    public static int max3Digit(int n, int k) {

        int increase = 0;

        int hundreds = n / 100;
        increase = Math.min(k, 9 - hundreds);
        hundreds = hundreds + increase;
        k = k - increase;

        int tens = (n % 100) / 10;
        increase = Math.min(k, 9 - tens);
        tens += increase;
        k -= increase;

        int ones = n % 10;
        increase = Math.min(k, 9 - ones);
        ones += increase;
        k -= increase;

        return ((hundreds * 100) + (tens * 10) + ones);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(max3Digit(n, k));
        sc.close();
    }
}
