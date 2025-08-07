import java.util.Scanner;

public class Check_if_the_array_is_sorted
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

        int flag = 0;
        int idx = arr[0];

        for(int i = 1;i < size;i++)
        {
            if(idx <= arr[i])
            {
                idx = arr[i];
            }
            else
            {
                System.out.println(false);
                flag = 1;
                break;
            }
        }

        if(flag == 0)
            System.out.println(true);




        sc.close();
    }        
}
