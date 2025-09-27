// -------------------------------------------------------------------------------------
//  Desc :- To find the XOR from L to N numbers
// Ex :- What is the XOR from n = 4 to m = 7 , means we need to find the xor for 4^5^6^7 , 

// Method - I :- Brute Force (by running for loop we can iterate from 4 and do the xor , but the interviewer will ask us to opitmize that ,then we will user  )

// Below code steps in detailed understanding ->

// Method - II :-

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class _5_find_xor_from_L_to_N_numbers {

    public static int findXorTillN(int n) {
        if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else if (n % 4 == 3) {
            return 0;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        n = findXorTillN(n - 1);
        m = findXorTillN(m);

        System.out.print(n ^ m);

        sc.close();
    }
}
