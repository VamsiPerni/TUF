// package TUF.Step - 3 Problems on Arrays.Lec -III Hard Arrays;


// Variation - I 

// to generate the entire Pascal triangle and then find the element at position (r,c). We will discuss in variation 3 how to generate Pascal’s triangle.

// // Method - 1 :- 
// import java.util.*;

// public class Pascals_triangle_var1
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int r = sc.nextInt();
//         int c = sc.nextInt();

//         // Pascal's Triangle

//         int n = r-1;
//         r = c-1;

//         int nume = 1;
//         int deno = 1;

//         int res = 1;

//         for(int i = 1;i <= r;i++)
//         {
//             nume = nume * n;
//             deno = deno * i;

//             n--;
//         }

//         System.out.println(nume/deno);

//         sc.close();
//     }        
// }



// Method - 2 :- 
import java.util.*;

public class Pascals_triangle_var1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        // Pascal's Triangle

        int n = r-1;
        r = c-1;

        int res = 1;

        for(int i = 1;i <= r;i++)
        {
            res = res * n;
            res = res / i;
                 
            n--;
        }

        System.out.println(res);

        sc.close();
    }        
}
