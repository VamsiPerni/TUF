
// Method - I :-
// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class Longest_SubArray_postives_plus_neg {

    public static int longestSubarrayWithSumK(int[] arr, long k) {
        int n = arr.length;
        HashMap<Long, Integer> hash = new HashMap<>();
        int maxLen = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long remain = sum - k;

            if (hash.containsKey(remain)) {
                int val = i - hash.get(remain);
                maxLen = Math.max(maxLen, val);
            }

            if (!hash.containsKey(sum)) {
                hash.put(sum, i);
            }
        }

        return maxLen;
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