
// 169_Majority_Element
// -------------------------------------------------------------------------------------

// Method - I :- Brute Force Naive Approach(By using TWO for Loops) , select the
// first element in the array and traverse the whole array and increase the
// count if the element matches and if the count is greateer than N/2 then
// return that element
// Time Complexity :- O(n2)
// Space Comlpexity :-

// import java.util.*; // TRIED - SELF // can do it easily

// public class Majority_Element_169 {

// public static int majorityElement(int[] nums) {

// return 0;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(majorityElement(arr));

// sc.close();
// }
// }

// 169_Majority_Element
// -------------------------------------------------------------------------------------

// Method - II :- Better Approach (by using HASHING Data Structure )
// Time Complexity :- O(N) + O(N log N)
// Space Comlpexity :- O(N) // if we are having all the unique elements in the
// array

// import java.util.*;

// public class Majority_Element_169 {

// public static int majorityElement(int[] nums) {
// int n = nums.length;
// HashMap<Integer, Integer> hash = new HashMap<>();

// for (int i = 0; i < n; i++) {
// hash.put(nums[i], hash.getOrDefault(nums[i], 1) + 1);
// }

// int maxVal = Integer.MIN_VALUE;
// int result = Integer.MIN_VALUE;

// for (HashMap.Entry<Integer, Integer> itr : hash.entrySet()) {
// int temp = itr.getValue();
// if (temp > maxVal) {
// maxVal = temp;
// result = itr.getKey();
// }
// }

// return result;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(majorityElement(arr));

// sc.close();
// }
// }

// 169_Majority_Element
// -------------------------------------------------------------------------------------

// Method - II :- Optimal Approach (by using Moore's Voting Algorithm) Both the above better approach(using hashing) are having the same time complexity but if the interviewer ask to reduce the space complexity then we need to use this algo
// Time Complexity :- O(n) + O(n) = O(n)
// Space Comlpexity :- O(1)
// Youtube Link :- https://www.youtube.com/watch?v=nP_ns3uSh80
// Notebook :- Refer to page no :- 30 --> 15 pdf

import java.util.*;

public class Majority_Element_169 {

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int elem = 0, count = 0;

        // Applying Moore's Voting Algorithm
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                elem = nums[i];
            } else if (elem == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        // Verifying whether it is having majority or not
        int c1 = 0;
        for (int i = 0; i < n; i++) {
            if (elem == nums[i]) {
                c1++;
            }
        }

        if (c1 > n / 2) {
            return elem;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(majorityElement(arr));

        sc.close();
    }
}