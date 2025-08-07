
// Method - 3 (OWN) :- Optimal Solution
import java.util.Scanner;
public class Second_largest_smallest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0;i < size;i++)
        {
            arr[i] = sc.nextInt();
        }

        if(size == 1)
        {
            System.out.println("Second Largest : -1");
            System.out.println("Second Smallest : -1");
        }
        else
        {
            // Finding second max
            int fmax = arr[0];
            int smax = -1;  /// In case the array contains negative values then take the smax as Integer.MIN_VALUE  
            
            for(int i = 1;i < size;i++) 
            {
                if(arr[i] > fmax)
                {
                    int temp = fmax;
                    fmax = arr[i];
                    smax = temp;
                }
                if(arr[i] > smax && arr[i] < fmax)
                    smax = arr[i];
            }
            System.out.println("Second Largest : "+smax);

            //Finding second min

            int fmin = arr[0];
            int smin = arr[1];

            for(int i = 1;i < size;i++)
            {
                if(arr[i] < fmin)
                {
                    int temp = fmin;
                    fmin = arr[i];
                    smin = temp;
                }
                if(arr[i] < smin  && arr[i] > fmin)
                    smin = arr[i];
            }

            System.out.println("Second Smallest : "+smin);

        }
        


        sc.close();
    }        
}
