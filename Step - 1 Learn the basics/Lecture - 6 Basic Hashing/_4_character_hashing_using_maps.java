// package TUF.Step - 1 Learn the basics.Lecture - 6 Basic Hashing;

// Method - 1 :- 

import java.util.*;
public class _4_character_hashing_using_maps
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int queries = sc.nextInt();
        sc.nextLine();

        // Pre-calculation using HashMap        
        Map<Character,Integer> hash = new HashMap<>();

        for(int i = 0;i < str.length();i++)
        {
            hash.put(str.charAt(i),hash.getOrDefault(str.charAt(i),0)+1);
        }

        // Fetching
        while(queries != 0)
        {
            char temp = sc.next().charAt(0);
            System.out.println(hash.getOrDefault(temp,0));
            queries--;
        }

        sc.close();
    }     
}
