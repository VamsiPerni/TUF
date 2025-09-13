// -------------------------------------------------------------------------------------
// Desc :- Implementation of Postfix to Prefix
// practice :- https://www.naukri.com/code360/problems/convert-prefix-to-postfix_8391014

// Time Complexity :- O(n + n) = O(2n)
// Space Comlpexity :- O(n)

import java.util.*;

public class Prefix_to_Postfix {

    public static String prefixToPostfix(String str) {
        Stack<String> stack = new Stack<>(); // O(n) space

        for (int i = str.length() - 1; i >= 0; i--) { // O(n)
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                String temp = ch + "";
                stack.push(temp);
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();
                String ans = t1 + t2 + ch; // O(n1 + n2)

                stack.push(ans);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(prefixToPostfix(str));

        sc.close();
    }
}
