
// ---------------------------------------------------------------------------------------------

import java.util.*;

public class CharacterIndex {

    public static String charcterPosition(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            int first = str.indexOf(c);
            String repeat = "";

            int times = 0;

            if (first == i) {
                times = i + 1;
            } else {
                times = first + 1;
            }

            for (int k = 0; k < times; k++) {
                repeat = repeat + c;
            }

            res = res + repeat + "-";
        }

        return res.substring(0, res.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.print(charcterPosition(str));

        sc.close();
    }
}

// ---------------------------------------------------------------------------------------------

// import java.util.*;

// public class CharacterIndex {

// public static String charcterPosition(String str) {
// StringBuilder res = new StringBuilder();
// Map<Character, Integer> map = new HashMap<>();

// for (int i = 0; i < str.length(); i++) {
// char c = str.charAt(i);
// map.put(c, map.getOrDefault(c, 0) + 1);
// int count = map.get(c);

// if (count == 1)
// res.append(String.valueOf(c).repeat(i + 1));
// else
// res.append(String.valueOf(c).repeat(str.indexOf(c) + 1));

// if (i < str.length() - 1)
// res.append("-");
// }
// return res.toString();
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// String str = sc.nextLine();

// System.out.println(charcterPosition(str));

// sc.close();
// }
// }
