// -------------------------------------------------------------------------------------
// Desc :-
// Below code steps in detailed understanding ->

// Method - I :- Brute Force

// Time Complexity :- O(n)
// Space Comlpexity :- O(n)

import java.util.*; // TRIED - SELF

public class Reverse_Words_String_151 {
    public static String reverseWords(String str) {

        String arr[] = str.trim().split("\\s+");
        String res = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i] + " ";
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(reverseWords(str));

        sc.close();
    }
}

// -------------------------------------------------------------------------------------
// Desc :-
// Below code steps in detailed understanding ->

// Method - I :- Optimal Approach

// Time Complexity :-
// Space Comlpexity :-

// import java.util.*;

// public class Reverse_Words_String_151 {
// public static String reverseWords(String str) {

// String res = "";
// StringBuilder builder = new StringBuilder();

// for (int i = str.length() - 1; i >= 0; i--) {
// if (Character.isLetter(str.charAt(i))) {

// }
// }

// return res;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// String str = sc.nextLine();
// System.out.print(reverseWords(str));

// sc.close();
// }
// }