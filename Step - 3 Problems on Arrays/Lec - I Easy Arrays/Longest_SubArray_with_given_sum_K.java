// Longest Subarray with given Sum K(Positives)
// Method - I :-
// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class Longest_SubArray_with_given_sum_K {

    public static int longestSubarrayWithSumK(int[] arr, int k) {

        int n = arr.length;
        int maxCount = 0;
        int temp = 0;
        int tempCount = 0;

        for (int i = 0; i < n; i++) {
            temp = temp + arr[i];

            if (temp > k) {
                temp = 0;
                continue;
            }

            tempCount++;

            if (temp == k) {
                if (maxCount < tempCount)
                    maxCount = tempCount;
            }

        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(longestSubarrayWithSumK(arr, k));

        sc.close();
    }
}
