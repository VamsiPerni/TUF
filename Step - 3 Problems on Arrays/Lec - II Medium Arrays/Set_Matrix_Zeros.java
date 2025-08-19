// -------------------------------------------------------------------------------------
// 73. Set Matrix Zeroes

// Desc :-

// Method - I :-Brute Force Approach 

// Time Complexity :- O(nm)
// Space Comlpexity :- O(mn)

// import java.util.*; // TRIED - SELF , Works fine but taking more space complexity

// public class Set_Matrix_Zeros {

//     public static void makeZero(int[][] matrix, int row0, int col0) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         // making row zero
//         for (int i = 0; i < col; i++) {
//             matrix[row0][i] = 0;
//         }

//         // making col zero
//         for (int i = 0; i < row; i++) {
//             matrix[i][col0] = 0;
//         }
//     }

//     public static void setZeroes(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         int[][] copyMax = new int[row][col];

//         // copying the whole array
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 copyMax[i][j] = matrix[i][j];
//             }
//         }

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 if (matrix[i][j] == 0) {
//                     makeZero(copyMax, i, j);
//                 }
//             }
//         }

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 matrix[i][j] = copyMax[i][j];
//             }
//         }

//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int[][] arr = new int[row][col];

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         setZeroes(arr);

//         // printing the output

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 73. Set Matrix Zeroes

// Desc :-

// Method - I :- Brute Force Approch (by marking zero rows and columns as some negative or any other number)

// Time Complexity :- (n*m)*(n+m) + (n*m) => it is some where near about O(n3)
// Space Comlpexity :-

// import java.util.*;

// public class Set_Matrix_Zeros {
//     public static void makeZero(int[][] matrix, int row0, int col0) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         // marking row -1
//         for (int i = 0; i < col; i++) {
//             if (matrix[row0][i] != 0) {
//                 matrix[row0][i] = -777;
//             }
//         }

//         // marking column as -1

//         for (int i = 0; i < row; i++) {
//             if (matrix[i][col0] != 0) {
//                 matrix[i][col0] = -777;
//             }
//         }

//     }

//     public static void setZeroes(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 if (matrix[i][j] == 0) {
//                     makeZero(matrix, i, j);
//                 }
//             }
//         }

//         // making all -1 to zeroes
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 if (matrix[i][j] == -777) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int[][] arr = new int[row][col];

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         setZeroes(arr);

//         // printing the output

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 73. Set Matrix Zeroes

// Desc :-

// Method - II :- Better Approach 

// Time Complexity :- O(n*m) + O(n*m) = O(2*nm)
// Space Comlpexity :- O(n) + O(m)

// import java.util.*;

// public class Set_Matrix_Zeros {
//     public static void makeZeros(int[][] matrix, int[] tempR0, int[] tempC0) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         // marking zeroes for rows
//         for (int i = 0; i < row; i++) {
//             if (tempR0[i] == 1) {
//                 for (int j = 0; j < col; j++) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         // marking zeroes for columns
//         for (int i = 0; i < col; i++) {
//             if (tempC0[i] == 1) {
//                 for (int j = 0; j < row; j++) {
//                     matrix[j][i] = 0;
//                 }
//             }
//         }

//         // HAVE A LOOK AT BELOW CODE ONCE

//         // I have written the above code and we can write it more optmized way than
//         // above like writing within the same for loops for both rows and columns
//         // marking as zero

//         // for (int i = 0; i < row; i++) {
//         // for (int j = 0; j < col; j++) {
//         // if (tempR0[i] == 1 || tempC0[j] == 1) {
//         // matrix[i][j] = 0;
//         // }
//         // }
//         // }

//     }

//     public static void setZeroes(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;
//         int tempR0[] = new int[row];
//         int tempC0[] = new int[col];

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 if (matrix[i][j] == 0) {
//                     tempR0[i] = 1;
//                     tempC0[j] = 1;
//                 }
//             }
//         }

//         makeZeros(matrix, tempR0, tempC0);

//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int row = sc.nextInt();
//         int col = sc.nextInt();

//         int[][] arr = new int[row][col];

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         setZeroes(arr);

//         // printing the output

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 73. Set Matrix Zeroes

// Desc :-

// Method - III :- Optimal Approach (without using any extra space and doing it in in-place)

// Time Complexity :- O(2*n*m)
// Space Comlpexity :- O(1)

import java.util.*;

public class Set_Matrix_Zeros {
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length; // matrix[..][0]
        int col = matrix[0].length; // matrix[0][..]
        int col0 = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {

                    if (j == 0) {
                        col0 = 0;
                        matrix[i][0] = 0;
                    } else {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        setZeroes(arr);

        // printing the output

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
