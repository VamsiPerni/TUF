// package Step - 4 Binary Search.Lesson - 1 BS on 1D Arrays;

import java.util.Scanner;

// Method - 1 :- Brute force (By using Linear Search method) - i have done
// public class Implement_Lower_Bound
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

//         int x = sc.nextInt();
//         int flag = 0;

//         if(x == 0)
//         {
//             System.out.println(0);
//         }
//         else
//         {
//         for(int i = 0;i < size;i++)
//         {
//             if(arr[i] == x)
//             {
//                 System.out.println("Index : "+i);
//                 flag = 1;
//                 break;
//             }
//             if(arr[i] > x && arr[i-1] < x)
//             {
//                 System.out.println("Index : "+i);
//                 flag = 1;
//                 break;
//             }
//         }
//         }

//         if(flag == 0)
//         {
//             System.out.println(size);
//         }

//         sc.close();
//     }
// }


// public class Implement_Lower_Bound
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

//         int x = sc.nextInt();
//         int flag = 0;

//         if(x == 0)
//         {
//             System.out.println(0);
//         }
//         else
//         {
//         for(int i = 0;i < size;i++)
//         {
//             if(arr[i] >= x)
//             {
//                 System.out.println("Index : "+i);
//                 flag = 1;
//                 break;
//             }
//         }
//         }

//         if(flag == 0)
//         {
//             System.out.println(size);
//         }

//         sc.close();
//     }
// }


// Method - 2 :- Optimal Solution by using (Binary Search)

public class Implement_Lower_Bound
{
    public static int binarySearch(int arr[],int x,int n)
    {
        int low = 0,high = n-1,mid = 0;

        if(x <=  arr[0])
        {
            return 0;
        }
        while(low <= high)
        {
            mid = (low+high)/2;

            if(arr[mid] == x)
            {
                return mid;
            }
            if(arr[mid] > x && arr[mid-1] > x)
            {
                high = mid-1;
            }
            else if(arr[mid] > x && arr[mid-1] < x)
            {
                return mid;
            }
            else
            {
                low = mid+1;
            }
            
        }

        return n;
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

        int x = sc.nextInt();
        int result = binarySearch(arr,x,size);
        
        System.out.println(result);

        sc.close();
    }
}
