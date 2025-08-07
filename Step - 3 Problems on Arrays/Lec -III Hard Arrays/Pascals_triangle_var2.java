import java.util.Scanner;

// Variation - II :- Given the row number n. Print the n-th row of Pascal’s triangle.

// // Method - 1  :- Naive Approach 

// public class Pascals_triangle_var2
// {
//     public static int funNcR(int n,int r)
//     {
//         int res = 1;

//         if(n == 0 || r == 0)
//             return res;

//         for(int i = 0;i < r;i++)
//         {
//             res = res * (n-i);
//             res = res / (i+1);
//         }

//         return res;
//     }
//      public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int row = sc.nextInt();

//         for(int i = 1;i <= row;i++)
//         {
//             System.out.print(funNcR(row-1,i-1)+" ");
//         }

//         sc.close();
//     }       
// }




// Method - 2  :- Optimal Approach 

public class Pascals_triangle_var2
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int ans = 1;
        System.out.print(ans+" ");

        for(int i = 1;i < row;i++)
        {
            ans = (ans *(row-i))/i;
            System.out.print(ans+" ");
        }

        sc.close();
    }       
}
