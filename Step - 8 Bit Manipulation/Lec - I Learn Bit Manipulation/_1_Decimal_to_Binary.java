// -------------------------------------------------------------------------------------
//  Desc :- Implementation of Decimal TO Binary Code
// Method - I :-

// Time Complexity :- log base 2 n
// Space Comlpexity :- log base 2 n

import java.util.*;

public class _1_Decimal_to_Binary {

    public static String reverseString(String str) {
        String res = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }

        return res;
    }

    public static String dec2Bin(int n) {
        String res = "";

        while (n != 1) {
            if (n % 2 == 1)
                res += 1;
            else
                res += 0;

            n = n / 2;
        }
        res += 1;

        res = reverseString(res);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int res = Integer.parseInt(dec2Bin());
        System.out.print(dec2Bin(num));

        sc.close();
    }
}

// Below code steps in detailed understanding ->

/*
 * Problem:Convert Decimal to Binary
 * 
 * Logic to Remember:
 * 
 * Keep dividing the number by 2.
 * 
 * Store the remainders(n%2)→they form the binary digits(LSB to MSB).
 * 
 * Keep appending these remainders in a string.
 * 
 * At the end,reverse the string(since binary is built backwards).
 * 
 * Return the reversed string as the binary result.
 * 
 * Key Functions in Code:
 * 
 * dec2Bin(n)→builds binary string using remainders.
 * 
 * reverseString(str)→reverses the collected digits.
 * 
 * Example:
 * 
 * Input:13
 * 
 * Steps:13%2=1,6%2=0,3%2=1,1(stop)→"1011"
 * 
 * Output:"1101"after reversing→Binary of 13 is 1101.
 * 
 */