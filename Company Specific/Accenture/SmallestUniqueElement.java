// import java.util.*;

// public class SmallestUniqueElement {

//     public static int smallest(int n, int[][] arr) {

//         int res = -1;

//         HashMap<Integer, Integer> hash = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 hash.put(arr[i][j], hash.getOrDefault(arr[i][j], 0) + 1);
//             }
//         }

//         for (Map.Entry<Integer, Integer> itr : hash.entrySet()) {
//             if (itr.getValue() == 1) {
//                 res = itr.getKey();
//                 return res;
//             }
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[][] = new int[n][n];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.print(smallest(n, arr));

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------------

// import java.util.*;

// public class SmallestUniqueElement {

//     public static int smallest(int n, int[][] arr) {

//         int res = -1;
//         int max = -1;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (arr[i][j] > max) {
//                     max = arr[i][j];
//                 }
//             }
//         }

//         int resArr[] = new int[max + 1];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 resArr[arr[i][j]]++;
//             }
//         }

//         for (int i = 0; i < resArr.length; i++) {
//             if (resArr[i] == 1) {
//                 return i;
//             }
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[][] = new int[n][n];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.print(smallest(n, arr));

//         sc.close();
//     }
// }

// --------------------------------if the array -----------------------------------------------------------

// follwer id , fname,lname , followers_count , and cound should be less than

// import java.util.*;

// public class SmallestUniqueElement {

//     public static int smallest(int n, int[][] arr) {
//         int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++) {
//                 min = Math.min(min, arr[i][j]);
//                 max = Math.max(max, arr[i][j]);
//             }

//         long range = (long) max - (long) min + 1L;
//         if (range > Integer.MAX_VALUE / 2) {
//             // Range too large for array — fall back to a map (avoid OOM)
//             return smallestWithMap(n, arr);
//         }

//         int[] count = new int[(int) range];
//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++)
//                 count[arr[i][j] - min]++;

//         for (int i = 0; i < count.length; i++) {
//             if (count[i] == 1)
//                 return i + min;
//         }
//         return -1;
//     }

//     private static int smallestWithMap(int n, int[][] arr) {
//         Map<Integer, Integer> freq = new HashMap<>();
//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++)
//                 freq.put(arr[i][j], freq.getOrDefault(arr[i][j], 0) + 1);

//         int ans = Integer.MAX_VALUE;
//         for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
//             if (e.getValue() == 1)
//                 ans = Math.min(ans, e.getKey());
//         }
//         return (ans == Integer.MAX_VALUE) ? -1 : ans;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[][] arr = new int[n][n];
//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++)
//                 arr[i][j] = sc.nextInt();
//         System.out.println(smallest(n, arr));
//         sc.close();
//     }
// }

// import java.util.*;

// public class SmallestUniqueElement {

//     public static int smallest(int n, int[][] arr) {
//         HashMap<Integer, Integer> hash = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 hash.put(arr[i][j], hash.getOrDefault(arr[i][j], 0) + 1);
//             }
//         }

//         int res = Integer.MAX_VALUE;

//         for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
//             if (entry.getValue() == 1) {
//                 res = Math.min(res, entry.getKey());
//             }
//         }

//         return (res == Integer.MAX_VALUE) ? -1 : res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[][] = new int[n][n];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println(smallest(n, arr));
//         sc.close();
//     }
// }

import java.util.*;

public class SmallestUniqueElement {

    public static int smallest(int n, int[][] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] >= 0) {
                    hash.put(arr[i][j], hash.getOrDefault(arr[i][j], 0) + 1);
                }
            }
        }

        int res = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() == 1) {
                res = Math.min(res, entry.getKey());
            }
        }

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(smallest(n, arr));
        sc.close();
    }
}
