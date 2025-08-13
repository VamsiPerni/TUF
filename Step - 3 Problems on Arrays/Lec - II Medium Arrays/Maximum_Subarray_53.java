
// -------------------------------------------------------------------------------------
// Maximum_Subarray (53 leetcode)

// Method - I :- Brute Force (By iterating through every subarray and storing the maximum sum) by having 3 for-loops
// Time Complexity :- O(n3)  // near about n3 not exactly but we need to say as O(n3)
// Space Comlpexity :- O(1)

import java.util.*; // TUF 

public class Maximum_Subarray_53 {

    public static int maxSubArray(int[] nums) {

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSubArray(arr));

        sc.close();
    }
}

// -------------------------------------------------------------------------------------
// Maximum_Subarray (53 leetcode)

// Method - I :- Better Approach (by using two for-loops , it is the optimized
// version of the above one)
// Time Complexity :- O(n2)
// Space Comlpexity :- O(1)

// import java.util.*; // TRIED-SELF , can do it easily

// public class Maximum_Subarray_53 {

// public static int maxSubArray(int[] nums) {

// return 0;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(maxSubArray(arr));

// sc.close();
// }
// }

// -------------------------------------------------------------------------------------
// Maximum_Subarray (53 leetcode)

// Method - I :- Optimal Approach (by using )
// Time Complexity :-
// Space Comlpexity :-

// import java.util.*;

// public class Maximum_Subarray_53 {

// public static int maxSubArray(int[] nums) {

// return 0;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(maxSubArray(arr));

// sc.close();
// }
// }