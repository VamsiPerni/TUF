// -------------------------------------------------------------------------------------
//  Desc :- Implementation of Infix to Prefix
// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class Infix_to_Prefix {
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

    public static String reverse(String str) {
        String res = "";
        char arr[] = str.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ')') {
                res = res + '(';
            } else if (arr[i] == '(') {
                res = res + ')';
            } else {
                res = res + arr[i];
            }
        }
        return res;
    }

    public static String controlledInfixToPostfix(String str) {
        String ans = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
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
                } else if (str.charAt(i) == '^') {
                    char ch = str.charAt(i);

                    while (!stack.isEmpty() && stack.peek() != '(' &&
                            (priority(stack.peek()) > priority(ch) ||
                                    (priority(stack.peek()) == priority(ch) && ch == '^'))) {
                        ans = ans + stack.pop();
                    }
                    stack.push(ch);

                } else if (!stack.empty() && (priority(str.charAt(i)) >= priority(stack.peek()))) {
                    stack.push(str.charAt(i));
                } else {
                    while (!stack.empty() && priority(str.charAt(i)) < priority(stack.peek())) {
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

    public static String infixToPrefix(String str) {

        // Step - 1 :- Reverse given string ,and change { ( to ) } and ) to ( while
        // reversing the string
        str = reverse(str);

        // Step - 2 :- Controlled Infix to Prefix Conversion(minimal change of actual
        // Infix to Postfix conversion )
        // NOTE :- If we got the {^} power operatior ,then we will remove all the
        str = controlledInfixToPostfix(str);

        // // Step - 3 :- Reverse the string again , and return the output
        str = reverse(str);

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(infixToPrefix(str));

        sc.close();
    }
}
