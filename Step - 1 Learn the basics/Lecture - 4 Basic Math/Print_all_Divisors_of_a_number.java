import java.util.Scanner;
import java.util.*;


// 1.Self written - Method - 1 :- Brute Force Approach

// public class Print_all_Divisors_of_a_number
// {
//     public static List<Integer> printDivisors(int n)
//     {
//         List<Integer> list = new ArrayList<>();
//         list.add(1);

//         for(int i = 2;i <= n;i++)
//         {
//             if(n%i == 0)
//                 list.add(i);
//         }

//         return list;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         List<Integer> result = new ArrayList<>();
//         result = printDivisors(n);

//         for(int i : result)
//         {
//             System.out.print(i+" ");
//         }

//         sc.close();
//     }        
// }



// Method - 2 :- Optimal Approach 

public class Print_all_Divisors_of_a_number
{
    public static List<Integer> printDivisors(int n)
    {
        List<Integer> list = new ArrayList<>();

        int sqrt = (int) Math.sqrt(n);

        for(int i = 1;i <= sqrt;i++)
        {
            if(n%i == 0)
            {
                list.add(i);

            if(i != n/i)
                list.add(n/i);
                
            }
        }

        Collections.sort(list);

        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        result = printDivisors(n);

        for(int i : result)
        {
            System.out.print(i+" ");
        }

        sc.close();
    }        
}
