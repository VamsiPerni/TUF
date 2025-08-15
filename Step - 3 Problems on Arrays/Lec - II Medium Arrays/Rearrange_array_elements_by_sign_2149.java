// -------------------------------------------------------------------------------------
// Rearrange_array_elements_by_sign_2149  
// Variety-1 :- Equal number of positives and negatives
// Variety-2 :- Not Equal number of positives and negatives , if there are any numbers left extra then we need to add those at the last of the array

// Method - I :- Brute Force 
// Time Complexity :- O(n) + O(n/2) = O(n)
// Space Comlpexity :- O(n)

// import java.util.*; // TUF 

// public class Rearrange_array_elements_by_sign_2149 {
//     public static int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int pos[] = new int[n / 2]; // O(n/2) space
//         int neg[] = new int[n / 2]; // O(n/2) space => total O(n) space
//         int p = 0, ne = 0;

//         // O(n) time
//         for (int i = 0; i < n; i++) {
//             if (nums[i] < 0) {
//                 neg[ne] = nums[i];
//                 ne++;
//             } else {
//                 pos[p] = nums[i];
//                 p++;
//             }
//         }

//         // O(n/2) time
//         for (int i = 0; i < n / 2; i++) {
//             nums[i * 2] = pos[i];
//             nums[i * 2 + 1] = neg[i];
//         }

//         return nums;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         arr = rearrangeArray(arr);

//         // Printing the array
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// Rearrange_array_elements_by_sign_2149
// Variety-1 :- Equal number of positives and negatives
// Variety-2 :- Not Equal number of positives and negatives , if there are any
// numbers left extra then we need to add those at the last of the array

// Method - I :- Optimal Approach
// Time Complexity :- O(n) // here we are reducing the O(n/2) extra time
// complexity from the method-1
// Space Comlpexity :- O(n)

import java.util.*; // TRIED - SELF

public class Rearrange_array_elements_by_sign_2149 {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int resArr[] = new int[n];
        int pos = 0, neg = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                resArr[neg] = nums[i];
                neg += 2;
            } else {
                resArr[pos] = nums[i];
                pos += 2;
            }
        }

        return resArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        arr = rearrangeArray(arr);

        // Printing the array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
