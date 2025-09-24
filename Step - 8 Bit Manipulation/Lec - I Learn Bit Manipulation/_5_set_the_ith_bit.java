// -------------------------------------------------------------------------------------
//  Desc :- Set the ith bit
//  - if the ith bit is already set then we will get the same number else we will get the different number

// Below code steps in detailed understanding ->

// Method - I :- Brute Force 
// Method - II :- Better Approach (by using left shift operator)

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class _5_set_the_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ith = sc.nextInt();

        if ((num | (1 << ith)) == num) {
            System.out.print("Same");
        } else
            System.out.print("Not SAME");

        sc.close();
    }
}
