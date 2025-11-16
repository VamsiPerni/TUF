// -------------------------------------------------------------------------------------
// Desc :-

// Below code steps in detailed understanding ->
/*
    1.Sort the Array ,so it will be the lexographical order
    2.And Compare the First and Last till matching and then that is the result , which satisfies all the testcases
    
 */

// Method - I :-

// Time Complexity :-
// Space Comlpexity :-

import java.util.*; // TRIED - SELF

public class Longest_common_prefix_14 {
    public static String longestCommonPrefix(String[] str) {

        if (str.length <= 1) {
            return str[0];
        }

        String res = "";
        Arrays.sort(str);

        int i = 0;
        String s1 = str[0];
        String s2 = str[str.length - 1];

        while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
            res += s1.charAt(i);
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String s1 = sc.nextLine();
        // String[] arr = s1.split(" ");

        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.print(longestCommonPrefix(arr));
        sc.close();
    }
}
