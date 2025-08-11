
// --------------------------------------------------------------------------------------

// Method - I :- Brute Force Approach (not uses library function but used , instead of that we can use any sorting algorithm and do it , best sorting technique is of using merge sort )
// Time Complexity :- O(n logn)  if we used merge sort 
// Space Comlpexity :- O(n)

// import java.util.*; // TRIED - SELF

// public class Sort_Colors_75 {

//     public static void sortColors(int[] nums) {
//         int size = nums.length;
//         Arrays.sort(nums);

//         System.out.print("[");

//         for (int i = 0; i < size; i++) {
//             System.out.print(nums[i]);
//             if (i != size - 1) {
//                 System.out.print(",");
//             }
//         }

//         System.out.println("]");
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         sortColors(arr);

//         sc.close();
//     }
// }

// --------------------------------------------------------------------------------------

// Method - II :- Better Approach 
// Time Complexity :- O(n)  
// Space Comlpexity :- O(1)

// import java.util.*; // TUF

// public class Sort_Colors_75 {

//     public static void sortColors(int[] nums) {
//         int size = nums.length;
//         int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//         for (int i = 0; i < size; i++) {
//             if (nums[i] == 0) {
//                 cnt0++;
//             } else if (nums[i] == 1) {
//                 cnt1++;
//             } else
//                 cnt2++;

//         }

//         for (int i = 0; i < cnt0; i++) {
//             nums[i] = 0;
//         }

//         for (int i = cnt0; i < cnt0 + cnt1; i++) {
//             nums[i] = 1;
//         }

//         for (int i = cnt0 + cnt1; i < cnt0 + cnt1 + cnt2; i++) {
//             nums[i] = 2;
//         }

//         System.out.print("[");

//         for (int i = 0; i < size; i++) {
//             System.out.print(nums[i]);
//             if (i != size - 1) {
//                 System.out.print(",");
//             }
//         }

//         System.out.println("]");
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         sortColors(arr);

//         sc.close();
//     }
// }

// --------------------------------------------------------------------------------------

// Method - II :- Optimal Approach , Using Dutch National Flag Algorithm
// Time Complexity :- O()
// Space Comlpexity :- O()

import java.util.*; // TUF

public class Sort_Colors_75 {

    public static void sortColors(int[] nums) {
        int size = nums.length;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < size; i++) {

        }

        System.out.print("[");

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]);
            if (i != size - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sortColors(arr);

        sc.close();
    }
}
