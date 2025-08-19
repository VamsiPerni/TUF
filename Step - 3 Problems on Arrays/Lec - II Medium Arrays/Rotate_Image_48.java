// -------------------------------------------------------------------------------------
// 48. Rotate Image (Leetcode)

// Method - I :-

// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*;

public class Rotate_Image_48 {
    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int newMat[][] = new int[row][col];

        return;
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
