// -------------------------------------------------------------------------------------
//  Desc :- Count the numner of set bits

// Below code steps in detailed understanding ->

// Method - I :-Brute Force ()
// Method - II :-Better Approach()

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class _9_count_the_number_of_set_bits {
    public static int countSetBits(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n = (n & (n - 1));
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(countSetBits(n));

        sc.close();
    }
}
