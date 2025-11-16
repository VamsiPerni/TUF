import java.util.*;

public class Remove_Outermost_Parenthesis_1021 {
    public static String removeOuterParentheses(String s) {

        String res = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            count = s.charAt(i) == '(' ? ++count : --count;

            if (s.charAt(i) == '(' && count > 1) {
                res += "(";
            } else if (s.charAt(i) == ')' && count > 0) {
                res += ")";
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(removeOuterParentheses(s));

        sc.close();
    }
}
