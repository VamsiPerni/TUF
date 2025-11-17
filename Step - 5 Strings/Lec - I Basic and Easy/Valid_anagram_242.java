// -------------------------------------------------------------------------------------
// Desc :- 242. Valid Anagram

// Below code steps in detailed understanding ->

// Method - I :- Brute Force 

// Time Complexity :- O(n2)
// Space Comlpexity :- O(n)

// import java.util.*; // TRIED - SELF , TLE for 1 testcase in leetcode

// public class Valid_anagram_242 {

//     public static boolean isAnagram(String s, String t) {

//         if (s.length() != t.length())
//             return false;

//         StringBuilder t1 = new StringBuilder(t); // O(n) space

//         for (int i = 0; i < s.length(); i++) { // O(n) time
//             String check = s.charAt(i) + "";

//             if (!t.contains(check)) {
//                 return false;
//             } else {
//                 int rep = t1.indexOf(check); // O(n) time for checking
//                 t = t1.replace(rep, rep + 1, ")").toString(); // O(n) time for replacing the string
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();
//         String t = sc.nextLine();

//         System.out.print(isAnagram(s, t));

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// Desc :- 242. Valid Anagram

// Below code steps in detailed understanding ->

// Method - II :- Brute Force 

// Time Complexity :- O(n log n)
// Space Comlpexity :- O(n)

import java.util.*; // TRIED - SELF 

public class Valid_anagram_242 {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char a1[] = s.toCharArray(); // O(n) time , for converting string to array
        char a2[] = t.toCharArray(); // O(n) space , for each array

        Arrays.sort(a1); // O(n log n) time , for sorting (it uses a dual-pivot Quicksort or Timsort,
                         // which
                         // has an average and worst-case time complexity of O(n log n).)
        Arrays.sort(a2);

        for (int i = 0; i < s.length(); i++) { // O(n) time , for comparing
            if (a1[i] != a2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.print(isAnagram(s, t));

        sc.close();
    }
}

// -------------------------------------------------------------------------------------
// Desc :- 242. Valid Anagram

// Below code steps in detailed understanding ->

// Method - II :- Better approach , by using character hashing

// Time Complexity :-
// Space Comlpexity :-
