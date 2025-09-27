// -------------------------------------------------------------------------------------
//  Desc :- XOR of numbers in the given range is the problem , 
//  Q)Given an integer N , we need to find the XOR from 1 to N ?
//  Ex:- N = 4 ,  1^2^3^4 

// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :- O(1)
// Space Comlpexity :- O(1)

import java.util.*;

public class _4_find_xor_of_numbers {

    public static int findXorTillN(int n) {

        if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else if (n % 4 == 0) {
            return n;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(findXorTillN(n));

        sc.close();
    }
}
