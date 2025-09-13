// -------------------------------------------------------------------------------------
// Desc :- Implementation of Postfix to Infix
// practice :- https://www.naukri.com/code360/problems/postfix-to-infix_8382386

// Time Complexity :-  O(n) + O(n)
// Space Comlpexity :- O(n)

import java.util.*;

public class Postfix_to_Infix {
    public static int priority(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return -1;
    }

    public static String postfixToInfix(String str) {
        int i = 0;
        Stack<String> stack = new Stack<>(); // O(n)-space

        while (i < str.length()) { // O(n) for while loop
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                String temp = ch + "";
                stack.push(temp);
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();
                String ans = '(' + t2 + ch + t1 + ')';
                stack.push(ans);
            }

            i++;
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(postfixToInfix(str));

        sc.close();
    }
}
