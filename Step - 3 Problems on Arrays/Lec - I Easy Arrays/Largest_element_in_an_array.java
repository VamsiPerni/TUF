// package TUF.Step - 3 Problems on Arrays.Lec - I Easy Arrays;


// Method - 1 :- Normal Method / Brute Force Approach

// import java.util.*;
// public class Largest_element_in_an_array
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i = 0;i < n;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
        
//         // Finding the largest element

//         int max = Integer.MIN_VALUE;

//         for(int i : arr)
//         {
//             if(i > max)
//                 max = i;
//         }

//         System.out.println(max);


//         sc.close();
//     }     
// }



// Method - 2 :- Recursive Approach

import java.util.*;
public class Largest_element_in_an_array
{
    public static int max(int[] arr,int start,int size,int max)
    {
        if(start == size-1)
            return max;

        if(arr[start] > max)
            max = arr[start];
        
        start++;

        return max(arr,start,size,max);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int start = 0;
        int max = Integer.MIN_VALUE;

        System.out.print(max(arr,start,n,max));
       

        sc.close();
    }     
}