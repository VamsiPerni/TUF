
// -------------------------------------------------------------------------------------
// 128 Longest Consecutive Sequence (Leetcode ) :- https://leetcode.com/problems/longest-consecutive-sequence/description/

// Method - I :- Brute Force Tried but some test cases are getting failed
// Time Complexity :- 
// Space Comlpexity :- 

// import java.util.*; // TRIED - SELF 

// public class Longest_Consecutive_Sequence_128 {
//     public static int longestConsecutive(int[] nums) {
//         Arrays.sort(nums);

//         if (nums.length == 0)
//             return 0;

//         int count = 1;
//         int maxCount = 1;
//         int equal = -1;

//         for (int i = nums.length - 2; i >= 0; i--) {

//             if ((nums[i] + 1) == nums[i + 1] && equal != (nums[i] + 1)) {
//                 count++;
//             } else if (nums[i] == nums[i + 1]) {
//                 count++;
//                 equal = nums[i];
//             } else {
//                 maxCount = Math.max(count, maxCount);
//                 count = 1;
//                 equal = -1;
//             }
//         }

//         maxCount = Math.max(count, maxCount);

//         return maxCount;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(longestConsecutive(arr));
//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 128 Longest Consecutive Sequence (Leetcode ) :- https://leetcode.com/problems/longest-consecutive-sequence/description/

// Desc :- 

// Method - I :- Brute Force 

// Time Complexity :- O(n3)
// Space Comlpexity :- O(1)

// YoutubeLink :- https://www.youtube.com/watch?v=oO5uLE7EUlM
// Note-Book :- PP-Book :- 5  

// import java.util.*; // TRIED - SELF after listening striver but getting O(n3) time complexiy

// public class Longest_Consecutive_Sequence_128 {

//     public static int longestConsecutive(int[] nums) {
//         int count = 0;
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             int tempEle = nums[i];
//             int tempCount = 0;

//             for (int j = 0; j < n; j++) {
//                 int flag = -1;

//                 for (int k = 0; k < n; k++) {
//                     if (nums[k] == tempEle) {
//                         tempCount++;
//                         flag = 1;
//                         break;
//                     }
//                 }

//                 if (flag == -1) {
//                     break;
//                 } else {
//                     tempEle++;
//                 }
//             }

//             count = Math.max(tempCount, count);
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(longestConsecutive(arr));
//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 128 Longest Consecutive Sequence (Leetcode ) :- https://leetcode.com/problems/longest-consecutive-sequence/description/

// Desc :- 

// Method - I :- Brute Force 

// Time Complexity :- O(n2)
// Space Comlpexity :- O(1)

// YoutubeLink :- https://www.youtube.com/watch?v=oO5uLE7EUlM
// Note-Book :- PP-Book :- 6  

import java.util.*; // TRIED - SELF after listening striver but getting O(n3) time complexiy

// public class Longest_Consecutive_Sequence_128 {

//     public static int longestConsecutive(int[] nums) {

//         return 0;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(longestConsecutive(arr));
//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 128 Longest Consecutive Sequence (Leetcode ) :-  https://leetcode.com/problems/longest-consecutive-sequence/description/

// Desc :-

// Method - II :- Better Apporach

// Time Complexity :- O(n) * O(n) = O(n)
// Space Comlpexity :- O(1)

// YoutubeLink :- https://www.youtube.com/watch?v=oO5uLE7EUlM
// Note-Book :- PP-Book :- 6

// import java.util.*; // TRIED - SELF after listening striver , same as he written

// public class Longest_Consecutive_Sequence_128 {

//     public static int longestConsecutive(int[] nums) {

//         if (nums.length < 1) {
//             return 0;
//         }

//         Arrays.sort(nums);

//         int maxCount = 1;
//         int lastSmall = Integer.MIN_VALUE;
//         int count = 1;

//         for (int i = 0; i < nums.length; i++) {
//             if (lastSmall == nums[i] - 1) {
//                 lastSmall = nums[i];
//                 count++;
//             } else if (lastSmall == nums[i]) {
//                 continue;
//             } else {
//                 lastSmall = nums[i];
//                 count = 1;
//             }
//             maxCount = Math.max(count, maxCount);
//         }

//         return maxCount;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(longestConsecutive(arr));
//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 128 Longest Consecutive Sequence (Leetcode ) :-
// https://leetcode.com/problems/longest-consecutive-sequence/description/

// Desc :-

// Method - III :- Optimal Approach (By using HashSet)

// Time Complexity :- O(N) + O(2*N) => O(3n) for unordered set 
// Time Complexity :- O(N*logN) rather than using follwing this oredered_set method , we can simple use the better approach which will give us the best time complexity than this  
// Space Comlpexity :- O(N)

// YoutubeLink :- https://www.youtube.com/watch?v=oO5uLE7EUlM
// Note-Book :- PP-Book :- 8

// import java.util.*; // TRIED - SELF after listening striver but getting O(n3) time complexiy

public class Longest_Consecutive_Sequence_128 {

    public static int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;

        Set<Integer> hash = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hash.add(nums[i]);
        }

        // logic start here
        int maxCount = 1;

        for (int it : hash) {
            if (!hash.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (hash.contains(x + 1)) {
                    cnt++;
                    x++;
                }
                maxCount = Math.max(cnt, maxCount);
            }
        }

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
