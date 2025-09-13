// -------------------------------------------------------------------------------------
// Desc :- Implementation of Prefix to Infix
// practice :- https://www.naukri.com/code360/problems/prefix-to-infix_1215000

// Time Complexity :- O(n) + O(n) = O(2n)
// Space Comlpexity :- O(n)

import java.util.*;

public class Prefix_to_Infix {

    public static String prefixToInfix(String str) {
        int i = str.length() - 1;
        Stack<String> stack = new Stack<>();

        while (i >= 0) { // O(n)
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                String temp = ch + "";
                stack.push(temp);
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();
                String ans = '(' + t1 + ch + t2 + ')'; // O(n1 + n2) for addding two strings it may take O(n1+n2) time
                                                       // complexity in worst case

                stack.push(ans);
            }
            i--;
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(prefixToInfix(str));

        sc.close();
    }
}
