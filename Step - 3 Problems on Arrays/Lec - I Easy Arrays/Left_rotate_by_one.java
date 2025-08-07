
// Method - 1 (OWN):- Optimal Solution
// Time Complexity :- O(N)
// Space Complexity :- O(1)

import java.util.Scanner;
public class Left_rotate_by_one
{
    public static int[] answer(int[] arr,int n)
    {
        int temp = arr[0];

        for(int i = 0;i < n-1;i++)
        {
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;

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

        // rotating the array 

        arr = answer(arr,size);

        // Printing the rotated array 

        for(int i = 0;i < size;i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }        
}
