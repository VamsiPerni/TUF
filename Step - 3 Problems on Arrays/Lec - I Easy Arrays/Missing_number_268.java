
// Method - I :- Brute Force Approach 
// Time Complexity :- O(n log n)
// Space Comlpexity = O(n)

// import java.util.*;

// public class Missing_number_268 {
//     public static int missingNumber(int[] arr, int n) {
//         Arrays.sort(arr); // TC :- O(n logn)
//         int start = arr[0] + 1;

//         for (int i = 1; i < n; i++) { // TC :- O(n)
//             if (start == arr[i]) {
//                 start++;
//                 continue;
//             }

//             return start;
//         }

//         return n;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         Arrays.fill(arr, Integer.MAX_VALUE);

//         for (int i = 0; i < size - 1; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(missingNumber(arr, size));

//         sc.close();
//     }
// }

// Method - II :- Better Force Approach (using HASHING )
// Time Complexity :- O(n)
// Space Comlpexity :- O(n)

// import java.util.*;

// public class Missing_number_268 {
//     public static int missingNumber(int[] arr, int n)
//     {
//         int hash[] = new int[n+1];

//         // Storing the frequencies 
//         for(int i = 0;i < n;i++)
//         {
//             hash[arr[i]]++;
//         }

//         // checking the frequencies from 1 to N 
//         for(int i = 1;i < n;i++)
//         {
//             if(hash[i] == 0)
//                 return i;
//         }

//         return n;
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size - 1; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(missingNumber(arr, size));

//         sc.close();
//     }
// }

// Method - III :- Optimal Approach I (Summation Approach )
// Time Complexity :- O(n)
// Space Comlpexity :- O(1)

// import java.util.*;

// public class Missing_number_268 {
//     public static int missingNumber(int[] arr, int n)
//     {
//         // sum of all the natural numbers 
//         // Remove the below line if there is no zero then TC-1 will  pass else put the below line then another 2 testcases will get pass 
//         n = n - 1;  // Here we are only having three numbers without excluding zero here (zero will not come under natural numbers , so it may not work in leetcode)

//         int nSum = (n*(n+1))/2;

//         // array sum
//         int sum = 0;   
//         for(int i=0;i < n;i++)
//         {
//             sum = sum + arr[i];
//         }

//         return nSum-sum;
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size - 1; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(missingNumber(arr, size));

//         sc.close();
//     }
// }

// Method - III :- Optimal Approach II (XOR Approach ) , not optimized version , the below code is for just understanding purpose 
// Time Complexity :- 
// Space Comlpexity :- 

// import java.util.*;

// public class Missing_number_268 {

//     // This code in only from { 0 to N including 0} natural numbers
//     public static int missingNumber(int[] arr, int n)
//     {
//         int xor1 = 0;    
//         int xor2 = 0;

//         for(int i = 1;i < n;i++)
//         {
//             xor1 = xor1 ^ i;
//         }

//         for(int i = 0;i < n;i++)
//         {
//             xor2 = xor2 ^ arr[i];
//         }

//         return xor1 ^ xor2;
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size - 1; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(missingNumber(arr, size));

//         sc.close();
//     }
// }

// BELOW CODE ONLY WORKS FOR Stirve's TUF and only TC1 will works fine
// Method - III :- Optimal Approach II (XOR Approach ) , Optimized version
// Time Complexity :- O(n)
// Space Comlpexity :- O(1)

// import java.util.*;
// public class Missing_number_268 {

//     public static int missingNumber(int[] arr, int n) {

//         int xor1 = 0, xor2 = 0;

//         for (int i = 0; i < n; i++) {
//             xor1 = xor1 ^ arr[i];
//             xor2 = xor2 ^ i;
//         }

//         xor2 = xor2 ^ n;

//         return xor1 ^ xor2;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size - 1; i++) { // only difference in the striver's tuf and leetcode is just {size-1}
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(missingNumber(arr, size));

//         sc.close();
//     }
// }

// BELOW CODE ONLY WORKS FOR LEET CODE TC2 and TC3 will works fine
// Method - III :- Optimal Approach II (XOR Approach ) , Optimized version
// Time Complexity :- O(n)
// Space Comlpexity :-O(1)

import java.util.*;

public class Missing_number_268 {

    public static int missingNumber(int[] arr, int n) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n; i++) {
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ i;
        }

        xor2 = xor2 ^ n;

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(missingNumber(arr, size));

        sc.close();
    }
}
