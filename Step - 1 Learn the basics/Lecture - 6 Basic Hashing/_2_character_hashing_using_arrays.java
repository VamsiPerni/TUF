// package TUF.Step - 1 Learn the basics.Lecture - 6 Basic Hashing;



// Method - 1 :- Declaring the array size for the atmost aplbhabets 


// import java.util.*;
// public class _2_character_hashing_using_arrays
// {
//     public static int characterHashArr(char search,int[] arr)
//     {
//         return arr[search - 'a'];
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         int queries = sc.nextInt();
//         sc.nextLine();

//         // Pre calculation
//         int arr[] = new int[26];

//         for(int i = 0;i < str.length();i++)
//         {
//             arr[str.charAt(i) - 'a']++;
//         }

//         String searchStr = sc.nextLine();
        
//         // Fetching
//         for(int i = 0;i < queries;i++)
//         {
//             char temp = searchStr.charAt(i);
//             System.out.println(characterHashArr(temp,arr));
//         }

//         sc.close();
//     }     
// }




// Method - 2 :-  Declaring the array full 256 ASCII numbers - For TestCase - 1 (Different Input style)

// import java.util.*;
// public class _2_character_hashing_using_arrays
// {
//     public static int characterHashArr(char search,int[] arr)
//     {
//         return arr[search];
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         int queries = sc.nextInt();
//         sc.nextLine();

//         // Pre calculation
//         int arr[] = new int[256];

//         for(int i = 0;i < str.length();i++)
//         {
//             arr[str.charAt(i)]++;
//         }

//         String searchStr = sc.nextLine();
        
//         // Fetching

//         for(int i = 0;i < queries;i++)
//         {
//             char temp = searchStr.charAt(i);
//             System.out.println(characterHashArr(temp,arr));
//         }

//         sc.close();
//     }     
// }



// Method - 2 :-  Declaring the array full 256 ASCII numbers - For TestCase - 2 (Different Input style)

import java.util.*;
public class _2_character_hashing_using_arrays
{
    public static int characterHashArr(char search,int[] arr)
    {
        return arr[search];
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int queries = sc.nextInt();
        sc.nextLine();

        // Pre calculation
        int arr[] = new int[256];

        for(int i = 0;i < str.length();i++)
        {
            arr[str.charAt(i)]++;
        }

        // String searchStr = sc.nextLine();
        
        // Fetching

        for(int i = 0;i < queries;i++)
        {
            char temp = sc.next().charAt(0);
            System.out.println(characterHashArr(temp,arr));
        }

        sc.close();
    }     
}
