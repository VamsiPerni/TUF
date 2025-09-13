// -------------------------------------------------------------------------------------
// Desc :- Implementation of Postfix to Prefix 
// practice :- https://www.naukri.com/code360/problems/prefix-to-infix_1215000

// Time Complexity :- O(n) + O(n) = O(2n)
// Space Comlpexity :- O(n)

import java.util.*;

public class Postfix_to_Prefix {

    public static String postfixToPrefix(String str) {
        Stack<String> stack = new Stack<>(); // O(n) space

        for (int i = 0; i < str.length(); i++) { // O(n)
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                String temp = ch + "";
                stack.push(temp);
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();
                String ans = ch + t2 + t1; // O(n1+n2) , in worst-case time complexity
                stack.push(ans);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(postfixToPrefix(str));

        sc.close();
    }
}
