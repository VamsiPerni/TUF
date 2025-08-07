// package TUF.Step - 1 Learn the basics.Lecture - 4 Basic Math;

import java.util.*;

public class Armstrong_Numbers
{
    public static boolean armstrong(int n)
    {
        int count = 0;
        int temp = n;

        while(temp != 0)
        {
            temp = temp / 10;
            count++;
        }

        int sum = 0;
        temp = n;

        while(temp != 0)
        {
            sum = sum + (int) Math.pow(temp%10,count);
            temp = temp / 10;
        }

        if(sum == n)
            return true;

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean res = armstrong(n);

        if(res == true)
            System.out.println("YES");
        else
            System.out.println("NO");


        sc.close();
    }        
}
