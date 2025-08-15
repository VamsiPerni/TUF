
// -------------------------------------------------------------------------------------
// Maximum_Subarray (53 leetcode)
// There are two types of varities that we can get in this question
// Variety-1 :- Just returning the maximum sub-array sum value no need to show which sub-array is giving that maximum sum 
// Variety-2 :- We need to return the which subarray is giving the maximum 

// Method - I :- Brute Force (By iterating through every subarray and storing the maximum sum) by having 3 for-loops
// Time Complexity :- O(n3)  // near about n3 not exactly but we need to say as O(n3)
// Space Comlpexity :- O(1)

// import java.util.*; // TUF 

// public class Maximum_Subarray_53 {

//     public static int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int sum = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {

//             for (int j = i; j < n; j++) {
//                 int tempSum = 0;

//                 for (int k = i; k <= j; k++) {
//                     tempSum += nums[k];
//                 }

//                 sum = Math.max(tempSum, sum);
//             }
//         }

//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(maxSubArray(arr));

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// Maximum_Subarray (53 leetcode)

// Method - II :- Better Approach (by using two for-loops , it is the optimized
// version of the above one)
// Time Complexity :- O(n2)
// Space Comlpexity :- O(1)

// import java.util.*; // TRIED-SELF 

// public class Maximum_Subarray_53 {

//     public static int maxSubArray(int[] nums) {

//         int n = nums.length;
//         int sum = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {

//             int tempSum = 0;

//             for (int j = i; j < n; j++) {
//                 tempSum += nums[j];
//                 sum = Math.max(tempSum, sum);
//             }
//         }

//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(maxSubArray(arr));

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// Maximum_Subarray (53 leetcode)

// Method - I :- Optimal Approach (by using Kadane's Algorithm)
// Time Complexity :- O(n)
// Space Comlpexity :- O(1)
// YoutubeLink :- https://www.youtube.com/watch?v=AHZpyENo7k4
// Note-Book :- page - 30 -> 15 in pdf

import java.util.*;

public class Maximum_Subarray_53 {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = Integer.MIN_VALUE, tempSum = 0;

        for (int i = 0; i < n; i++) {

            if (tempSum < 0) {
                tempSum = 0;
            }

            tempSum += nums[i];

            sum = Math.max(tempSum, sum);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(maxSubArray(arr));

        sc.close();
    }
}