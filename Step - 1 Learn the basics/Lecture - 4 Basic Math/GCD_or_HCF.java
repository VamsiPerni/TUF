// package TUF.Step - 1 Learn the basics.Lecture - 4 Basic Math;

import java.util.*;
// import java.math.*;

// 1.Normal Method (Iterative Method)

// public class GCD_or_HCF
// {
//     public static int calcGCD(int n,int m)
//     {
//         int result = 1;

//         for(int i = 2;i < 100;i++)
//         {
//             if(n%i == 0 && m%i == 0)
//             {
//                 result = i;
//             }
//         }

//         return result;
//     }
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         System.out.println(calcGCD(n,m));

//         sc.close();
//     }        
// }



// Method - 1 :- Brute Force Method (From tuf)

// public class GCD_or_HCF
// {
//     public static int calcGCD(int n,int m)
//     {
//         int result = 1;

//         for(int i = 2;i <= Math.min(n,m);i++)
//         {
//             if(n%i == 0 && m%i == 0)
//             {
//                 result = i;
//             }
//         }

//         return result;
//     }
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         System.out.println(calcGCD(n,m));

//         sc.close();
//     }        
// }



// Method - 2 :- Same Time complexity but some Better Apporach than preivous , in real-time it will iterate less times


// We can optimise the time complexity of the previous approach. In the worst case, the loop iterates from 1 up to the minimum of N1 and N2. This could potentially result in a large number of iterations, especially when one input number is significantly larger than the other.

// If we iterate from the minimum of N1 and N2 down to 1, we reduce the number of iterations because we start from the potentially largest common factor and work downwards.

// The time complexity of this approach remains O(min(N1, N2)) but in practice, it will execute fewer iterations on average.


// public class GCD_or_HCF
// {
//     public static int calcGCD(int n,int m)
//     {
//         int result = 1;

//         for(int i = Math.min(n,m);i >= 2;i--)
//         {
//             if(n%i == 0 && m%i == 0)
//             {
//                 result = i;
//                 break;
//             }
//         }

//         return result;
//     }
    
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         System.out.println(calcGCD(n,m));

//         sc.close();
//     }        
// }

// ---------------------------------------------->>>


// Method - 2 :- Euclidean Algorithm Creating the GCD or HCF function 

// The Euclidean Algorithm is a method for finding the greatest common divisor of two numbers. It operates on the principle that the GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.

// To find the GCD of n1 and n2 where n1 > n2:

// Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
// Once one of them becomes 0, the other number is the GCD of the original numbers.
// Eg, n1 = 20, n2 = 15:

// gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)

// gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)

// gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)

// gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)

// Hence, return 5 as the gcd.


public class GCD_or_HCF
{
    public static int calcGCD(int n,int m)
    {
        if(m == 0)
            return n;
        
        return calcGCD(m,n%m);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(calcGCD(n,m));

        sc.close();
    }        
}
