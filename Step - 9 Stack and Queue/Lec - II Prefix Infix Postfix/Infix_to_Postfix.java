// -------------------------------------------------------------------------------------
//  1.Implementation of Infix TO Postfix Using Stack
// Below code steps in detailed understanding ->  Step - 9 Stack and Queue\Lec - II Prefix Infix Postfix\notes\1.png

// Method - I :-

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class Infix_to_Postfix {
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

    public static String infixToPostfix(String str) {
        int n = str.length();
        String ans = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                ans = ans + str.charAt(i);
            } else if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {

                while (!stack.empty() && stack.peek() != '(') {
                    ans = ans + stack.pop();
                }
                stack.pop();
            } else {

                if (stack.empty()) {
                    stack.push(str.charAt(i));
                } else if (!stack.empty() && (priority(str.charAt(i)) > priority(stack.peek()))) {
                    stack.push(str.charAt(i));
                } else {
                    while (!stack.empty() && priority(str.charAt(i)) <= priority(stack.peek())) {
                        ans = ans + stack.pop();
                    }
                    stack.push(str.charAt(i));
                }
            }
        }

        while (!stack.empty()) {
            ans = ans + stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(infixToPostfix(str));

        sc.close();
    }
}
