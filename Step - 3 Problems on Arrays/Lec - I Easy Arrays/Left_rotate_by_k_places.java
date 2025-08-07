
// // Method - 1(OWN) :- Brute Force 
// // Time Complexity :- 
// // Space Complexity :- 

// import java.util.Scanner;
// public class Left_rotate_by_k_places
// {
//     public static int[] rotateArray(int[] arr,int size,int k)
//     {
//         while(k != 0)
//         {
//             int temp = arr[0];

//             for(int i = 0;i < size-1;i++)
//             {
//                 arr[i] = arr[i+1];
//             }

//             arr[size-1] = temp;
//             k--;
//         }

//         return arr;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int size = sc.nextInt();
//         int arr[] = new int[size];
        
//         for(int i = 0;i < size;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
        
//         int k = sc.nextInt();

//         // left rotate array by K places function

//         arr = rotateArray(arr,size,k);


//         // Printing the rotated array 

//         for(int i = 0;i < size;i++)
//         {
//             System.out.print(arr[i]+" ");
//         };


//         sc.close();
//     }       
// }




// // Method - 1 :- Better Approach 
// // Time Complexity :- O(n)
// // Space Complexity :- O(n)

// import java.util.Scanner;
// public class Left_rotate_by_k_places
// {
//     public static int[] rotateArray(int[] arr,int size,int k)
//     {
//         k = k%size;

//         int temp[] = new int[size];
//         for(int i = 0;i < k;i++)
//         {
//             temp[i] = arr[i];
//         }

//         for(int i = 0;i < k;i++)
//         {
//             arr[i] = arr[size-k+i];
//         }

//         for(int i = size-k;i < size;i++)
//         {
//             arr[i] = temp[i-(size-k)];
//         }

//         return arr;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int size = sc.nextInt();
//         int arr[] = new int[size];
        
//         for(int i = 0;i < size;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
        
//         int k = sc.nextInt();

//         // left rotate array by K places function

//         arr = rotateArray(arr,size,k);


//         // Printing the rotated array 

//         for(int i = 0;i < size;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();
//     }       
// }





// Method - 1 :- Optimal Approach by revsering
// Time Complexity :- 
// Space Complexity :- 


import java.util.Scanner;
public class Left_rotate_by_k_places
{
    public static int[] reverseArray(int[] arr,int start,int end)
    {
        while(start < end)
        {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
        }

        return arr;
    }

    public static int[] rotateArray(int[] arr,int size,int k)
    {
        k = k%size;

        arr = reverseArray(arr,0,k-1);
        arr = reverseArray(arr,k,size-1);
        arr = reverseArray(arr,0,size-1);

        return arr;
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
        
        int k = sc.nextInt();

        // left rotate array by K places function

        arr = rotateArray(arr,size,k);


        // Printing the rotated array 

        for(int i = 0;i < size;i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }       
}
