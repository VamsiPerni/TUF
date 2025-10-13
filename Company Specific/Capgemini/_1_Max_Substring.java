// -------------------------------------------------------------------------------------
//  Desc :- We have to find the maximum length of m in string of m and we need to print the starting and the ending index of that particular string

// Method - I :-
// Time Complexity :- 
// Space Comlpexity :- 

// import java.util.*; // Solution which i have Self-tried in exam - WRONG ANSWER

// public class _1_Max_Substring {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         sc.nextLine();

//         String str = sc.nextLine();
//         int c1 = -1, c2 = -1;

//         for (int i = 0; i < n; i++) {
//             if (str.charAt(i) == 'm') {
//                 for (int j = i + 1; j < n; i++) {

//                 }
//             }
//         }

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------

//  Desc :- We have to find the maximum length of min string of m and we need to print the starting and the ending index of that particular string

// Method - I :- By using TWO for-loops
// Time Complexity :- O(n2)
// Space Comlpexity :- O(1)

// import java.util.*; // Using two-for loops and extra array space of length 2

// public class _1_Max_Substring {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         sc.nextLine();
//         String str = sc.nextLine();
//         int arr[] = new int[2];
//         int max = -1;
//         int tempStore = -1;

//         for (int i = 0; i < n; i++) {
//             int tempMax = 0;
//             for (int j = i; j < n; j++) {
//                 if (str.charAt(j) == 'm') {
//                     tempMax++;
//                     continue;
//                 } else {
//                     tempStore = j - 1;
//                     break;
//                 }
//             }

//             if (tempMax > max) {
//                 max = tempMax;
//                 arr[0] = i;
//                 arr[1] = tempStore;
//             }

//         }

//         System.out.print(arr[0] + " " + arr[1]);

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------

//  Desc :- We have to find the maximum length of min string of m and we need to print the starting and the ending index of that particular string

// Method - I :- Reducing Time Complexity than the above code
// Time Complexity :- O(n)
// Space Comlpexity :- O(1)

import java.util.*; // Using two-for loops and extra array space of length 2

public class _1_Max_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        int sidx = -1;
        int lidx = -1;
        int maxCount = 0;
        int tempL = 0;

        for (int i = 0; i < n; i++) {
            int temp = i;
            int tempCount = 0;
            while (i < n && str.charAt(i) == 'm') {
                tempL = i;
                tempCount++;
                i++;
            }

            if (tempCount > maxCount) {
                maxCount = tempCount;
                sidx = temp;
                lidx = tempL;
            }
        }

        System.out.print(sidx + " " + lidx);

        sc.close();
    }
}