
// -------------------------------------------------------------------------------------
// 128 Longest Consecutive Sequence (Leetcode ) :- https://leetcode.com/problems/longest-consecutive-sequence/description/

// Method - I :-
// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*; // TRIED - SELF 

public class Longest_Consecutive_Sequence_128 {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 0)
            return 0;

        int count = 1;
        int maxCount = 1;
        int equal = -1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if ((nums[i] + 1) == nums[i + 1] && equal != (nums[i] + 1)) {
                count++;
            } else if (nums[i] == nums[i + 1]) {
                count++;
                equal = nums[i];
            } else {
                maxCount = Math.max(count, maxCount);
                count = 1;
                equal = -1;
            }
        }

        maxCount = Math.max(count, maxCount);

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(longestConsecutive(arr));
        sc.close();
    }
}
