// package TUF.Step - 2 Sorting Techniques.Lecture - 1 Sorting - I;

import java.util.*;
public class Selection_Sort
{
    public static int[] selection_sort(int[] arr)
    {
        for(int i = 0;i < arr.length-1;i++)
        {
            int min = i;

            for(int j = i+1;j < arr.length;j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

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

        // sorting function 
        arr = selection_sort(arr);

        // printing
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

        sc.close();
    } 
}
