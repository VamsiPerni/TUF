
// Method - I :- By using Two pointers (Greedy apporach) , it will work for only positive integers (o to n) not for negative integers 
// Time Complexity :- 
// Space Comlpexity :- 

// import java.util.*; // TRIED - SELF

// public class Count_Subarrays_Sum_Equals_560 {

//     public static int subarraySum(int[] arr, int k) {
//         int n = arr.length;
//         int count = 0, right = 0, left = 0, sum = 0;

//         while (right < n && left < n) {

//             if (right < n)
//                 sum += arr[right];

//             while (sum > k && left < right) {
//                 sum -= arr[left];
//                 left++;
//             }

//             if (sum == k) {
//                 count++;
//             }

//             right++;
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int k = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println(subarraySum(arr, k));

//         sc.close();
//     }
// }

// ------------------------------------------------------------------------------------------

// Method - I :- By using (Hashing) , it will work for BOTH positives and negative integers
// Time Complexity :-
// Space Comlpexity :-

import java.util.*; // TRIED - SELF

public class Count_Subarrays_Sum_Equals_560 {

    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0, count = 0;

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) {
                count++;
            }

            int remain = sum - k;

            if (hash.containsKey(remain)) {
                count += hash.get(remain);
            }

            hash.put(sum, hash.getOrDefault(sum, 0) + 1);

        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(subarraySum(arr, k));

        sc.close();
    }
}

// ------------------------------------------------------------------------------------------

// Method - I :- By using Two pointers (Greedy apporach)
// Time Complexity :-
// Space Comlpexity :-

// import java.util.*; // TRIED - SELF

// public class Count_Subarrays_Sum_Equals_560 {

// public static int subarraySum(int[] arr, int k) {
// int n = arr.length;

// return 0;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int k = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(subarraySum(arr, k));

// sc.close();
// }
// }

// ------------------------------------------------------------------------------------------

// Method - I :- By using Two pointers (Greedy apporach)
// Time Complexity :-
// Space Comlpexity :-

// import java.util.*; // TRIED - SELF

// public class Count_Subarrays_Sum_Equals_560 {

// public static int subarraySum(int[] arr, int k) {
// int n = arr.length;

// return 0;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int k = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(subarraySum(arr, k));

// sc.close();
// }
// }

// ------------------------------------------------------------------------------------------

// Method - I :- By using Two pointers (Greedy apporach)
// Time Complexity :-
// Space Comlpexity :-

// import java.util.*; // TRIED - SELF

// public class Count_Subarrays_Sum_Equals_560 {

// public static int subarraySum(int[] arr, int k) {
// int n = arr.length;

// return 0;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int k = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(subarraySum(arr, k));

// sc.close();
// }
// }
