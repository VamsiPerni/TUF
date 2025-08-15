
// ----------------------------------------------------------------------------------------------
// Maximum_ Subarray_variety_2  --> We need to return one of the maximum sub-array from the given array 

// Method - I :-
// Time Complexity :- O(n)
// Space Comlpexity :- O(n)

import java.util.*; // TRIED - SELF 

public class Maximum_Subarray_variety_2 {

    public static void maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = Integer.MIN_VALUE, tempSum = 0;
        int idxF = 0;
        int idxL = 0;

        for (int i = 0; i < n; i++) {

            if (tempSum < 0) {
                tempSum = 0;
                idxF = i;

            }

            tempSum += nums[i];

            int check = sum;
            sum = Math.max(tempSum, sum);

            if (check != sum) {
                idxL = i;
                check = sum;
            }
        }

        for (int i = idxF; i <= idxL; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        maxSubArray(arr);

        sc.close();
    }
}
