
// -------------------------------------------------------------------------------------
// Desc :-

// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :-
// Space Comlpexity :-

import java.util.*;

public class Roman_to_Integer_13 {
    public static int romanToInt(String str) {

        int res = 0;
        HashMap<Character, Integer> hash = new HashMap<>();

        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);

        if (str.length() == 1)
            return hash.get(str.charAt(0));

        for (int i = str.length() - 1; i > 0; i--) {

            if (hash.get(str.charAt(i)) <= hash.get(str.charAt(i - 1))) {
                res = res + hash.get(str.charAt(i));
                if (i - 1 == 0) {
                    res += hash.get(str.charAt(i - 1));
                }
            } else {
                res = res + (hash.get(str.charAt(i)) - hash.get(str.charAt(i - 1)));
                i--;
                if (i - 1 == 0) {
                    res += hash.get(str.charAt(i - 1));
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(romanToInt(str));

        sc.close();
    }
}