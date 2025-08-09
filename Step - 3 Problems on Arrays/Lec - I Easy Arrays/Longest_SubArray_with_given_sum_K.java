
// Longest Subarray with given Sum K(Positives)
// --------------------------------------------------------------------

// // Method - I :- Brute Force Approach , Trail (Wrong solution ,works for only some testcases)
// // Time Complexity :- 
// // Space Comlpexity :- 

// import java.util.*;  // TRIED SELF

// public class Longest_SubArray_with_given_sum_K {

//     public static int longestSubarrayWithSumK(int[] arr, int k) {

//         int n = arr.length;
//         int maxCount = 0;

//         for (int i = 0; i < n; i++) {
//             int tempSum = 0;
//             int tempCount = 0;
//             for (int j = i; j < n; j++) {
//                 tempSum = tempSum + arr[j];
//                 tempCount++;
//                 if (tempSum == k) {
//                     if (tempCount > maxCount) {
//                         maxCount = tempCount;
//                     }
//                 }
//                 if (tempSum > k) {
//                     tempSum = tempSum - arr[j];
//                     tempCount--;
//                     if (tempSum == k) {
//                         if (tempCount > maxCount) {
//                             maxCount = tempCount;
//                         }
//                     }
//                 }
//             }
//         }

//         return maxCount;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(longestSubarrayWithSumK(arr, k));

//         sc.close();
//     }
// }

// --------------------------------------------------------------------

// Method - I :- Brute Force Approach (Using two for loops)
// Time Complexity :- O(n2)
// Space Comlpexity :- O(1)

// import java.util.*; // TRIED - SELF

// public class Longest_SubArray_with_given_sum_K {

//     public static int longestSubarrayWithSumK(int[] arr, int k) {
//         int n = arr.length;
//         int maxLen = 0;

//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum = sum + arr[j];
//                 if (sum == k) {
//                     int temp = j - i + 1;
//                     if (temp > maxLen) {
//                         maxLen = temp;
//                     }
//                 }
//             }
//         }
//         return maxLen;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(longestSubarrayWithSumK(arr, k));

//         sc.close();
//     }
// }

// --------------------------------------------------------------------

// Method - I :- Better Approacch (Using hashing) , if the testcases are having the zero included in it then it will not work correct , and the next part of the code will be resolving that issue
// Time Complexity :- O(n2)
// Space Comlpexity :- O(1)

// import java.util.*;   // TRIED - SELF

// public class Longest_SubArray_with_given_sum_K {

//     public static int longestSubarrayWithSumK(int[] arr, int k) {
//         int n = arr.length;
//         HashMap<Integer, Integer> hash = new HashMap<>();
//         int sum = 0;
//         int maxLen = 0;

//         for (int i = 0; i < n; i++) {
//             sum += arr[i];

//             hash.put(sum, i);

//             if (sum == k)
//                 maxLen = i + 1;

//             if (sum > k) {
//                 int search = sum - k;

//                 for (Map.Entry<Integer, Integer> itr : hash.entrySet()) {
//                     if (itr.getKey() == search) {
//                         int val = itr.getValue();
//                         int tempLen = i - val;
//                         if (tempLen > maxLen) {
//                             maxLen = tempLen;
//                         }
//                     }
//                     if (itr.getKey() > search) {
//                         break;
//                     }
//                 }
//             }
//         }

//         return maxLen;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(longestSubarrayWithSumK(arr, k));

//         sc.close();
//     }
// }

// --------------------------------------------------------------------

// Method - II :- Better Approacch (Using hashing) , for all the test cases including o to n number of positive integers and NEGATIVE numbers also 

// Time Complexity :- O(n)
// Space Comlpexity :- O(n)

import java.util.*; // TUF

public class Longest_SubArray_with_given_sum_K {

    public static int longestSubarrayWithSumK(int[] arr, long k) {
        int n = arr.length;
        HashMap<Long, Integer> hash = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k)
                maxLen = Math.max(maxLen, i + 1);

            long remSum = sum - k;

            if (hash.containsKey(remSum)) {
                int len = i - hash.get(remSum);
                maxLen = Math.max(maxLen, len);
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

// --------------------------------------------------------------------

// Method - III :- Optimal Approach (Two Pointers , greedy approach) , for all
// the test cases including o to n number of positive integers
// Time Complexity :- O()
// Space Comlpexity :- O()

// import java.util.*; // TRIED - SELF

// public class Longest_SubArray_with_given_sum_K {

// public static int longestSubarrayWithSumK(int[] arr, long k) {
// int maxLen = 0, left = 0, right = 0;
// int n = arr.length;
// int sum = 0;

// for (int i = 0; i < n; i++) {

// if (sum == k) {
// int temp = i - left;
// maxLen = Math.max(maxLen, temp);
// }

// sum += arr[i];

// while (sum > k) {
// sum = sum - arr[left];
// left++;
// }

// }

// return maxLen;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int k = sc.nextInt();
// int arr[] = new int[n];

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.print(longestSubarrayWithSumK(arr, k));

// sc.close();
// }
// }

// --------------------------------------------------------------------

// Method - III :- Optimal Approach (Two Pointers , greedy approach) , for all
// the test cases including o to n number of positive integers
// Time Complexity :- O()
// Space Comlpexity :- O()

// import java.util.*; // TUF

// public class Longest_SubArray_with_given_sum_K {

// public static int longestSubarrayWithSumK(int[] arr, long k) {
// int maxLen = 0, left = 0, right = 0;
// int n = arr.length;
// int sum = arr[0];

// while (right < n) {

// while (left <= right && sum > k) {
// sum -= arr[left];
// left++;
// }

// if (sum == k) {
// maxLen = Math.max(maxLen, right - left + 1);
// }

// right++;

// if (right < n) {
// sum += arr[right];
// }
// }

// return maxLen;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// int k = sc.nextInt();
// int arr[] = new int[n];

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.print(longestSubarrayWithSumK(arr, k));

// sc.close();
// }
// }