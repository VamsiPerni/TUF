
// ---------------------------------------------------------------------------------------

// import java.util.*;

// public class RangeSum {

//     public static int calculateRangeSum(int[] arr) {
//         int totalSum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             int start = Math.max(0, i - arr[i]);
//             int end = i;
//             int rangeSum = 0;

//             for (int j = start; j <= end; j++) {
//                 rangeSum += arr[j];
//             }

//             totalSum += rangeSum;
//         }

//         return totalSum;
//     }

//     public static void main(String[] args) {

//         // int size = Integer.parseInt(args[0]);
//         // int[] arr = new int[size];

//         // // Read array elements from arguments
//         // for (int i = 0; i < size; i++) {
//         // arr[i] = Integer.parseInt(args[i + 1]);
//         // }

//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int result = calculateRangeSum(arr);

//         System.out.print(result);

//         sc.close();
//     }
// }

// ---------------------------------------------------------------------------------------

import java.util.*;

public class RangeSum {

    public static int calculateRangeSum(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = Math.max(0, i - arr[i]);
            int end = i;
            int rangeSum = 0;

            for (int j = start; j <= end; j++) {
                rangeSum += arr[j];
            }

            totalSum += rangeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {

        // int size = Integer.parseInt(args[0]);
        // int[] arr = new int[size];

        // // Read array elements from arguments
        // for (int i = 0; i < size; i++) {
        // arr[i] = Integer.parseInt(args[i + 1]);
        // }

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = calculateRangeSum(arr);

        System.out.print(result);

        sc.close();
    }
}
