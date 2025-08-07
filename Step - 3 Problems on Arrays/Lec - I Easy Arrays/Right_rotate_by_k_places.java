
import java.util.Scanner;
public class Right_rotate_by_k_places
{
    public static int[] rotate(int[] nums, int k)
    {
        int size = nums.length;
        k = k%size;
        int temp[] = new int[k];

        for(int i = 0;i < k;i++)
        {
            temp[i] = nums[size-k+i];
        }

        for(int i = 0;i < size-k;i++)
        {
            nums[size-i-1] = nums[size-k-i-1];
        }

        for(int i = 0;i < k;i++)
        {
            nums[i] = temp[i];
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
        
        int k = sc.nextInt();

        // left rotate array by K places function

        arr = rotate(arr,k);


        // Printing the rotated array 

        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }      
}
