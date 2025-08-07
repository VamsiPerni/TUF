import java.util.*;

//  1.Normal Method

public class String_is_Palindrome_or_not
{
    public static boolean palindrome(char[] arr,int start,int end)
    {
        if(start >= end)
            return true;

        if(arr[start] != arr[end])
            return false;
        
        return palindrome(arr,start+1,end-1);
    }
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Cleaning the string 
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        char[] arr = str.toCharArray();
        int start = 0 , end = arr.length-1;

        if(palindrome(arr,start,end))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        



        sc.close();
    }       
}
