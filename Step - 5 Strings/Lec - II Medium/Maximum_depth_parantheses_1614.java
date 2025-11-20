// -------------------------------------------------------------------------------------
// Desc :-

// Below code steps in detailed understanding ->

// Method - I :-

// Time Complexity :- O(n)
// Space Comlpexity :- O(1)

import java.util.*; // TRIED - SELF

public class Maximum_depth_parantheses_1614 {

    public static int maxDepth(String str) {
        int max = 0;
        int tempCount = 0;

        for (int i = 0; i < str.length(); i++) { // O(n) time ,
            if (str.charAt(i) == '(') {
                tempCount++;
                max = Math.max(max, tempCount);
            } else if (str.charAt(i) == ')') {
                tempCount--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(maxDepth(str));

        sc.close();
    }
}