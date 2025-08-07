import java.util.Scanner;

// public class Factorial_of_a_number
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        


//         sc.close();
//     } 
// }



// 2.Recursive Approach - OWN
// public class Factorial_of_a_number
// {
//     static int fact = 1;

//     public static int factorial(int n)
//     {
//         return fact(n,1);
//     }
//     public static int fact(int n,int fact)
//     {
//         if(n == 0)
//             return fact;
        
//         fact = fact * n;
//         return fact(n-1,fact);
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         System.out.println(factorial(num));

//         sc.close();
//     }        
// }



public class Factorial_of_a_number
{
    static int fact = 1;

    public static int factorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        return n * factorial(n-1);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(factorial(num));

        sc.close();
    }        
}

