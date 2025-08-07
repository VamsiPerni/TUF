import java.util.Scanner;

// Method - 1 :- Naive Approach 

// Time Complexity: O(n)+O(n), for calculating and printing the Fibonacci series.
// Space Complexity: O(n), for storing Fibonacci series.


// Method - 2 :- Space Optimized Approach

// Time Complexity: O(N).As we are iterating over just one for a loop.
// Space Complexity: O(1)


public class Fibonacci_Number
{
    public static void fibonacci(int n)
    {
        int f1 = 0 ,f2 = 1;

        if(n >= 1)
            System.out.print(f1+" ");

        while(f1 < n)
        {
            System.out.print(f2+" ");
            int temp = f2;
            f2 = f2+f1;
            f1 = temp;
        }
    }
    
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);

        sc.close();
    }       
}


// Method - 3 :- Recursice / Intuition Approach 

// Time Complexity: O(2^N) { This problem involves two function calls for each iteration which further expands to 4 function calls and so on which makes worst-case time complexity to be exponential in nature }.
// Space Complexity: O(N) { At maximum there could be N function calls waiting in the recursion stack since we need to calculate the Nth Fibonacci number for which we also need to calculate (N-1) Fibonacci numbers before it }.



// public class Fibonacci_Number
// {
//     public static int fibonacci(int n)
//     {
//         // base condidtion
//         if(n <= 1)
//             return n;
        
//         int res = fibonacci(n-1) + fibonacci(n-2);

//         return res;
//     }
    
//      public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int res = fibonacci(n);

//         sc.close();
//     }       
// }
