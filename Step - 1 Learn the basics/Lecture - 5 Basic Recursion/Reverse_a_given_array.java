import java.util.*;


// Method - 1 :- Brute force , By taking an extra array of the same size and doing

// Methodd - 2 :- 
// By using the Collections.reverse() function 

// public class Reverse_a_given_array
// {
//     public static List<Integer> reverse(List<Integer> list)
//     {
//         Collections.reverse(list);

//         return list;
//     }
//      public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int size = sc.nextInt();
//         List<Integer> list = new ArrayList<>();

//         for(int i = 0;i < size;i++)
//         {
//             int temp = sc.nextInt();
//             list.add(temp);
//         }

//         list = reverse(list);

//         for(int i : list)
//         {
//             System.out.print(i+" ");
//         }


//         sc.close();
//     }       
// }



// Method - 1 :- Brute force , Iterative Method - Time :- O(n) , Space :- O(n) , By taking an extra array of the same size and doing

// Methpd - 2 :- Space Optimized iterartive Method , Brute force , Iterative Method - Time :- O(n) , Space :- O(1) ,

// public class Reverse_a_given_array
// {
//     public static int[] reverse(int[] arr,int size)
//     {
//         int start = 0;
//         int end = size-1;

//         for(int i = 0;i <= size/2;i++)
//         {
//             if(start >= end)
//                 break;
            
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++; end--;

//         }

//         return arr;
//     }
//      public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++)
//         {
//             arr[i] = sc.nextInt();
//         }

//         arr = reverse(arr,size);

//         for(int i = 0;i < size;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
    
//         sc.close();
//     }       
// }



// Method - 3 :- Recursive Method , 


// public class Reverse_a_given_array
// {
//     public static int[] reverse(int[] arr,int start,int end)
//     {
//         if(start >= end)
//             return arr;

//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
        
//         return reverse(arr,start+1,end-1);

//     }
//      public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
        
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++)
//         {
//             arr[i] = sc.nextInt();
//         }

//         int start = 0,end = size-1;

//         arr = reverse(arr,start,end);

//         for(int i = 0;i < size;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
    
//         sc.close();
//     }       
// }



// Method - 4 :- Using library function (New Approach)

// arr is of type int[] (a primitive array).

// When you call Arrays.asList(arr), Java treats the entire array as one single object, not a list of Integers.

// So, Arrays.asList(arr) returns a list with one element: the whole int[] — not individual integers.

// That’s why Collections.reverse() does nothing to your actual array.


public class Reverse_a_given_array
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        Integer arr[] = new Integer[size];   // We need to use the Integer instead of int

        for(int i = 0;i < size;i++)
        {
            arr[i] = sc.nextInt();
        }

        Collections.reverse(Arrays.asList(arr));

        for(int i = 0;i < size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
        sc.close();
    }       
}



