// -------------------------------------------------------------------------------------
//  Desc :- Power of (leetcode 231)

// Below code steps in detailed understanding ->

// Method - I :-Brute Force ()
// Method - II :-Better Approach()

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class _8_powerOf2_231 {
    public static boolean isPowerOfTwo(int n) {

        if (n <= 0)
            return false;

        return ((n & (n - 1)) == 0) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));

        sc.close();
    }
}
