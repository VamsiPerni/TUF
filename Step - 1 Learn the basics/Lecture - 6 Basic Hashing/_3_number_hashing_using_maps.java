// package TUF.Step - 1 Learn the basics.Lecture - 6 Basic Hashing;

// Method - 1 :- With Using If else Condition only

import java.util.*;
public class _3_number_hashing_using_maps
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
        
        // Pre-Calculation
        Map<Integer,Integer> hash = new HashMap<>();
        
        for(int i = 0;i < size;i++)
        {
            if(hash.get(arr[i]) == null)
                hash.put(arr[i],1);
            else
                hash.put(arr[i],hash.get(arr[i])+1);
        }
        
        // Fetching
        int qur = sc.nextInt();

        while(qur != 0)
        {
            int temp = sc.nextInt();

            if(hash.get(temp) == null)
                System.out.println(0);
            else
                System.out.println(hash.get(temp));
        
            qur--;
        }



        sc.close();
    }     
}


// Method - 2 :- With Using hash.getOrDefault()  in-built Method 


