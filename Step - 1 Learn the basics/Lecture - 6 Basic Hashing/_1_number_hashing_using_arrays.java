// package TUF.Step - 1 Learn the basics.Lecture - 6 Basic Hashing;

import java.util.*;

// Method - 1 :- Main Variable - 10 power 6 atmost array , declaring the  variable in main function

public class _1_number_hashing_using_arrays
{
    public static int numberHash(int search,int[] arrPre)
    {
        // Fetching
        return arrPre[search];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0;i < size;i++)
        {
            arr[i] = sc.nextInt();
        }

        // Pre calculation 
        
        // Here we are able to declare the array size more than 10 power 6......but the limit in main function is 10 power 6 for int data type and we can declare 10 power 7 in global variable in int data type
        int arrPre[] = new int[1000000];

        for(int i = 0;i < size;i++)
        {
            arrPre[arr[i]]++;
        }

        int queries = sc.nextInt();

        while(queries != 0)
        {
            int temp = sc.nextInt();
            // Fetching
            System.out.println(numberHash(temp,arrPre));
            queries--;
        }

        sc.close();
    } 
}



// Method - 1 :- Main Variable - 10 power 7 atmost array , declaring the variable in gloabal array
