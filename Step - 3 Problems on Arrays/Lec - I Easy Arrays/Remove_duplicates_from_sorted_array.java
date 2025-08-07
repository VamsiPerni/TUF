
// // Method - 1 :- Brute Force , By using HashSet and Storing it again in the array
// Time Complexity :- O(N log N + N)
// Space Complexity :- O(N)
import java.util.*;
public class Remove_duplicates_from_sorted_array
{
    public static void removeDuplicates(int[] arr)
    {
        HashSet<Integer> hash = new HashSet<>();

        for(int i : arr)
        {
            hash.add(i);
        }

        int k = hash.size();
        int j = 0;

        for(int i : hash)
        {
            arr[j] = i;
            j++;
        }

        // printing
        for(int i = 0;i < k;i++)
        {
            System.out.print(arr[i]+" ");
        }
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
        
        removeDuplicates(arr);

        sc.close();
    }        
}



// Method - 2 :- Optimal , By using Two Pointers Method
// Time Complexity :- O(N)
// Space Complexity :- O(1)


// import java.util.Scanner;
// public class Remove_duplicates_from_sorted_array
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
        
//         // Logic starts here

//         int  j = 0;
//         int result = 0;

//         for(int i = 1;i < size;i++)
//         {
//             if(arr[j] != arr[i])
//             {
//                 arr[++j] = arr[i];
//             }
//         }
        
//         result = j+1;

//         // Printing 
//         for(int i = 0;i < result;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();
//     }        
// }