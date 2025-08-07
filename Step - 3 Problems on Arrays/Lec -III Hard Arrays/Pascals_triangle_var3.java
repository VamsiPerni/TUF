import java.util.Scanner;

// Variation - III -> We will ger the number of rows then we need to generate till that row of pascals traingle

// // Method - 1 :- Naive Approach 
// public class Pascals_triangle_var3
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

//         int rows = sc.nextInt();

//         for(int i = 1;i <= rows;i++)
//         {
//             int n = i;
//             int r = i;

//             for(int j = 1;j <= r;j++)
//             {
//                 System.out.print(funNcR(n-1,j-1)+" ");
//             }
//             System.out.println();
//         }


//         sc.close();
//     }       
// }







// Variation - III -> We will ger the number of rows then we need to generate till that row of pascals traingle

import java.util.*;
// Method - 2 :- Optimal Approach 
public class Pascals_triangle_var3
{
    public static int funNcR(int n,int r)
    {
        int res = 1;

        if(n == 0 || r == 0)
            return res;
        
        for(int i = 0;i < r;i++)
        {
            res = res * (n-i);
            res = res / (i+1);
        }

        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 1;i <= rows;i++)
        {
            int n = i;
            int r = i;

            List <Integer> temp_list = new ArrayList<>();

            for(int j = 1;j <= r;j++)
            {
                temp_list.add(funNcR(n-1,j-1));
            }

            result.add(temp_list);
        }

        // Printing the list

        for(List<Integer>  i : result)
        {
            for(int ele : i)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        

        sc.close();
    }       
}



