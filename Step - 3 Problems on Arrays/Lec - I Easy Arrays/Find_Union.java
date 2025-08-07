
// // Method - 1 Brute Force Approach:- OWN by using Hashset
// // Time Complexity :- O(n1 log n + n2 log n +) + O(n1+n2)
// // Space Complexity :- O(n1+n2)

// import java.util.*;
// public class Find_Union
// {
//     public static void union(int[] arr1,int n1,int[] arr2,int n2)
//     {
//         HashSet<Integer> hash = new HashSet<>();

//         for(int i = 0;i < n1;i++)
//         {
//             hash.add(arr1[i]);
//         }

//         for(int i = 0;i < n2;i++)
//         {
//             hash.add(arr2[i]);
//         }

//         int[] res = new int[hash.size()];
//         int j = 0;

//        for(int i : hash)
//        {
//             res[j++] = i;
//        }

//        // Printing the elements 
//        for(int i = 0;i < res.length;i++)
//        {
//         System.out.print(res[i]+" ");
//        }

//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
        
//         int arr1[] = new int[n1];
//         int arr2[] = new int[n2];

//         for(int i = 0;i < n1;i++)
//         {
//             arr1[i] = sc.nextInt();
//         }

//         for(int i = 0;i < n2;i++)
//         {
//             arr2[i] = sc.nextInt();
//         }

//         union(arr1,n1,arr2,n2);

//         sc.close();
//     }        
// }




// Method - 1 Optimal Approach:- by using TWOP Pointers Approach (the two arrys need to be sorted before applying this technique)
// Time Complexity :- O(n1 + n2)
// Space Complexity :- O(n1 + n2)

import java.util.*;
public class Find_Union
{
    public static void union(int[] arr1,int n1,int[] arr2,int n2)
    {
       int trav1 = 0;
       int trav2 = 0;
       ArrayList<Integer> list = new ArrayList<>();

       while(trav1 < n1 && trav2 < n2)
       {
            if(arr1[trav1] < arr2[trav2])
            {
                if(!list.contains(arr1[trav1]))
                {
                    list.add(arr1[trav1]);
                }
                trav1++;
            }
            else
            {
                if(!list.contains(arr2[trav2]))
                {
                    list.add(arr2[trav2]);
                }
                trav2++;
            }
       }

       while(trav1 < n1)
       {
            if(!list.contains(arr1[trav1]))
            {
                list.add(arr1[trav1]);
            }
            trav1++;
       }

       while(trav2 < n2)
       {
            if(!list.contains(arr2[trav2]))
            {
                list.add(arr2[trav2]);
            }
            trav2++;
       }

       Integer arr[] = list.toArray(new Integer[0]);

        for(int i : arr)
        {
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i = 0;i < n1;i++)
        {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0;i < n2;i++)
        {
            arr2[i] = sc.nextInt();
        }

        union(arr1,n1,arr2,n2);

        sc.close();
    }        
}
