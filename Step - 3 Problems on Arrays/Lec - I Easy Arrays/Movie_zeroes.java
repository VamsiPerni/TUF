
// // Method - 1 :- Brute Force Approach

// import java.util.Scanner;
// public class Movie_zeroes
// {
//     public static int[] moveZeroes(int[] nums)
//     {
//         int size = nums.length;
//         int arr[] = new int[size];
//         int count = 0;
        
//         for(int i = 0;i < size;i++)
//         {
//             if(nums[i] != 0)
//                 arr[count++] = nums[i];
//         }

//         for(int i = 0;i < size;i++)
//         {
//             nums[i] = arr[i];
//         }


//         return nums;
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

//         arr = moveZeroes(arr);

//         // Printing the array

//         for(int i = 0;i < size;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();
//     }        
// }



// Method - 1 :- Optimal Approach using TWO POINTERS METHOD

import java.util.Scanner;
public class Movie_zeroes
{
    public static int[] moveZeroes(int[] nums)
    {
        int n = nums.length;
        int j = -1;

        for(int i = 0;i < n;i++)
        {
            if(nums[i] == 0)
            {
                j = i;
                break;
            }
        }

        if(j != -1)
        {

        for(int i = j+1;i < n;i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        }


        return nums;
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

        arr = moveZeroes(arr);

        // Printing the array

        for(int i = 0;i < size;i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }        
}
