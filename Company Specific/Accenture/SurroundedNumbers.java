import java.util.Scanner;

public class SurroundedNumbers {

    // Method to count numbers surrounded by lowercase letters
    public int countSurroundedNumbers(String str) {
        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(str.charAt(i))) {
                int start = i;

                while (i < n && Character.isDigit(str.charAt(i))) {
                    i++;
                }

                boolean sbefore = (start > 0) && Character.isLowerCase(str.charAt(start - 1));

                boolean safter = (i < n) && Character.isLowerCase(str.charAt(i));

                if (sbefore && safter) {
                    count++;
                }

                i--;
            }
        }

        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        SurroundedNumbers obj = new SurroundedNumbers();
        int result = obj.countSurroundedNumbers(input);

        System.out.print(result);
        sc.close();
    }
}
