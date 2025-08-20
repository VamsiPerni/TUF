// -------------------------------------------------------------------------------------
// 48. Rotate Image (Leetcode)

// Method - I :- Brute Force Solution (by taking one more empty matrix and doing ,and we are not doing it in {in-place} )

// Time Complexity :- O(n2)
// Space Comlpexity :- O(n2)

// import java.util.*;

// public class Rotate_Image_48 {
//     public static void rotate(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;
//         int k = 0;

//         int newMat[][] = new int[row][col];

//         for (int i = row - 1; i >= 0; i--) {
//             for (int j = 0; j < col; j++) {
//                 newMat[j][k] = matrix[i][j]; // instead of k , we can put as [row-i-1] then also we will get the correct
//                                              // output as needed
//             }
//             k++;
//         }

//         // Changing the elements
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 matrix[i][j] = newMat[i][j];
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int matrix[][] = new int[row][col];

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         rotate(matrix);

//         // Printing the matrix

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 48. Rotate Image (Leetcode)

// Method - I :- Optimal Solution (with out taking any extra space )

// Time Complexity :- O(n2)
// Space Comlpexity :- O(1) 

import java.util.*;

public class Rotate_Image_48 {

    // public static void swap(int[][] matrix)

    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        // Transposing the matrix
        // O(n/2) * O(n/2) => O(n2)
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reversing the array
        // O(N) * O(N/2) => O(n2)

        for (int i = 0; i < row; i++) {
            int p1 = 0, p2 = row - 1;
            while (p1 < p2) {

                int temp = matrix[i][p1];
                matrix[i][p1] = matrix[i][p2];
                matrix[i][p2] = temp;

                p1++;
                p2--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotate(matrix);

        // Printing the matrix

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
