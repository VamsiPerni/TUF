
// Method - I :- (Using Two for loops  and linear search it's too eassy)
// Time Complexity :- O(3n) ->> O(n)   
// Space Comlpexity :- O(1)

// import java.util.*;

// public class Num_appear_once_SingleNumber_136 {
//     public static int singleNumber(int arr[], int n) {

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(singleNumber(arr, size));

//         sc.close();
//     }
// }

// Method - II :- Better Approach - I (Using Hashing but it only works for postive numbers and limited size of array (not for more numbers))
// Time Complexity :- O(n)   
// Space Comlpexity :- O(1)

// import java.util.*;

// public class Num_appear_once_SingleNumber_136 {
//     public static int singleNumber(int arr[], int n) {
//         if (n == 1)
//             return arr[0];

//         int hash[] = new int[n + 1];

//         for (int i = 0; i < n; i++) {
//             hash[arr[i]]++;
//         }

//         for (int i = 0; i < n; i++) {
//             if (hash[i] == 1) {
//                 return i;
//             }
//         }

//         return 0;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(singleNumber(arr, size));

//         sc.close();
//     }
// }

// Method - III :- Better Approach - II (Using Map DataStructure to tackle long numbers and negative numbers also)
// Time Complexity :- O(n)   
// Space Comlpexity :- O(n)

// import java.util.*;

// public class Num_appear_once_SingleNumber_136 {
//     public static int singleNumber(int arr[], int n) {

//         HashMap<Integer, Integer> hash = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             int val = hash.getOrDefault(arr[i], 0);
//             hash.put(arr[i], val + 1);
//         }

//         for (Map.Entry<Integer, Integer> i : hash.entrySet()) {
//             if (i.getValue() == 1)
//                 return i.getKey();
//         }

//         return 0;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print(singleNumber(arr, size));

//         sc.close();
//     }
// }

// Method - IV :- Optimal Solution (Using XOR )
// Time Complexity :- O(n)   
// Space Comlpexity :- O(n)

import java.util.*;

public class Num_appear_once_SingleNumber_136 {
    public static int singleNumber(int arr[], int n) {

        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }

        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(singleNumber(arr, size));

        sc.close();
    }
}