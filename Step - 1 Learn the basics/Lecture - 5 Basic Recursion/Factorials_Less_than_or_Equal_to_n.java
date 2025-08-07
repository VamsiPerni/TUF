// package TUF.Step - 1 Learn the basics.Lecture - 5 Basic Recursion;

import java.util.*;

public class Factorials_Less_than_or_Equal_to_n
{
    static ArrayList<Long> result = new ArrayList<>();
    static long fact = 1;
    static long num = 1;
    
    public static ArrayList<Long> factorialNumbers(long n)
    {
        if(fact > n)
            return result;
        
        result.add(fact);
        num = num + 1;
        fact = fact * (num);

        return factorialNumbers(n);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        ArrayList<Long> result = new ArrayList<>();
        result = factorialNumbers(n);

        for(Long i : result)
        {
            System.out.print(i+" ");
        }

        sc.close();
    }     
}
