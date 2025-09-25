// -------------------------------------------------------------------------------------
//  Desc :- Minimum Number of Bit Flips to Convert Number (leetcode 2220)

// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class _11_mini_bits_flips_to_convert_number2220 {

    public static int minBitFlips(int start, int goal) {

        int ans = start ^ goal;
        int count = 0;

        while (ans != 0) {
            count++;
            ans = (ans & (ans - 1));
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(minBitFlips(start, end));

        sc.close();
    }
}
