
// -------------------------------------------------------------------------------------
// Desc :-  1903. Largest Odd Number in String

// Below code steps in detailed understanding ->
// https://leetcode.com/problems/largest-odd-number-in-string/description/

// Method - I :- 

// Time Complexity :-
// Space Comlpexity :-

import java.util.*; // TRIED - SELF

public class Longest_Odd_number_string_1903 {
    public static String largestOddNumber(String num) {
        String res = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            if ((int) num.charAt(i) % 2 == 0) {
                continue;
            }
            res = num.substring(0, i + 1);
            break;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(largestOddNumber(str));

        sc.close();
    }
}
