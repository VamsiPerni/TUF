
// Method - I :-
// Time Complexity :- O(n)
// Space Comlpexity :- O(1)

import java.util.*;

public class Maximum_Concecutive_Ones_485 {
    public static int solution(int n, int[] arr) {
        int count = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                temp++;
            }

            if (arr[i] != 1) {

                temp = 0;
            }

            if (count < temp) {
                count = temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(n, arr));

        sc.close();
    }
}
