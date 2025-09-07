// -------------------------------------------------------------------------------------

// Method - I :-

// Time Complexity :-  O(N)
// Space Comlpexity :- O(N)

import java.util.*;

public class Valid_Parantheses_20 {
    public static boolean isValid(String str) {

        char arr[] = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } else {
                if (stack.empty())
                    return false;

                int temp = stack.pop();

                if (temp == '(' && arr[i] == ')')
                    continue;
                else if (temp == '{' && arr[i] == '}')
                    continue;
                else if (temp == '[' && arr[i] == ']')
                    continue;
                else
                    return false;
            }
        }

        // return true; It is wrong
        return stack.empty(); // here we are returning this because , what if the stack is having all the
                              // opening brackets and there are no closing brackets but still we are returning
                              // here as true , so we need to cover that case as , if the stack is empty at
                              // the last then it will return true else false , if there are only having
                              // closing brackets in the array then that testcase is covering in the else part
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isValid(str));

        sc.close();
    }
}