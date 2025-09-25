// -------------------------------------------------------------------------------------
//  Desc :- Toggle the ith bit 

// Below code steps in detailed understanding ->

// Method - I :-Brute Force ()
// Method - II :-Better Approach()

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class _7_Toggle_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ith = sc.nextInt();

        // Logic starts here
        n = n ^ (1 << ith);

        System.out.print(n);

        sc.close();
    }
}
