import java.util.Scanner;

// 1.Normal Method - OWN , Method - 1 :- Brute Force Approach

// public class Check_for_prime
// {  
//     public static boolean check_prime(int num)
//     {
//         for(int i = 2;i < num;i++)
//         {
//             if(num%i == 0)
//                 return false;
//         }

//         return true;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
        
//         if(check_prime(num))
//         {
//             System.out.println("Prime");
//         }
//         else
//         {
//             System.out.println("Not Prime");
//         }

//         sc.close();
//     }    
// }


// Method - 2 :- Optimal Approach

public class Check_for_prime
{  
    public static boolean check_prime(int num)
    {
        int sqrt = (int) Math.sqrt(num);

        for(int i = 2;i <= sqrt;i++)
        {
            if(num%i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        if(check_prime(num))
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }

        sc.close();
    }    
}
