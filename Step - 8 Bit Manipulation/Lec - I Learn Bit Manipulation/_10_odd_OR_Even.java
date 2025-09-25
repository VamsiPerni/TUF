// -------------------------------------------------------------------------------------
//  Desc :- To Find whether the number is Odd or Even by using Bit-Wise operators 

// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class _10_odd_OR_Even {
    public static String oddOrEven(int n) {
        if ((n & 1) == 0)
            return "Even";

        return "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(oddOrEven(n));

        sc.close();
    }
}
