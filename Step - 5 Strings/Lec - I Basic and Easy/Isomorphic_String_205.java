// -------------------------------------------------------------------------------------
// Desc :- 205. Isomorphic Strings

// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :-
// Space Comlpexity :-

import java.util.*;

public class Isomorphic_String_205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> h1 = new HashMap<>();
        HashMap<Character, Character> h2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (h1.containsKey(s.charAt(i))) {
                if ((h1.get(s.charAt(i)) != t.charAt(i))) {
                    return false;
                }
            } else if (h2.containsKey(t.charAt(i))) {
                if (h2.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                h1.put(s.charAt(i), t.charAt(i));
                h2.put(t.charAt(i), s.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.print(isIsomorphic(s, t));

        sc.close();
    }
}