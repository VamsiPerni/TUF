// package TUF;


// Problem - 1
// 1. N-Forest

// Input: ‘N’ = 3

// Output: 
// * * *
// * * *
// * * *

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 3;

//         int i = n;


//         while(i >= 1)
//         {
//             for(int j=0;j < n;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();

//             i--;
//         }


//     }
// }



// Problem - 2

// N/2-Forest

// Example:
// Input:  ‘N’ = 3

// Output: 
// * 
// * *
// * * *


// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 3;


//         int k = 1;
        
//         for(int i = 0;i < n;i++)
//         {
//             for(int j = 0;j < k;j++)
//             {
//                 System.out.print("* ");
//             }
//             if(k <= n)
//                 k++;
//             System.out.println();
//         }
           
//     }
// }

// Problem - 3
// N-Traingles

// Example:
// Input: ‘N’ = 3

// Output: 
// 1
// 1 2 
// 1 2 3


// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 3;

//         for(int i = 1;i <= n;i++)
//         {
//             for(int j = 1;j <= i;j++)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Problem - 4
// Traingle

// Example:
// Input: ‘N’ = 3

// Output: 
// 1
// 2 2 
// 3 3 3

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 3;

//         for(int i = 1;i <= n;i++)
//         {
//             for(int j = 1;j <= i;j++)
//             {
//                 System.out.print(i+" ");
//             }
//         System.out.println();
//         }
           
//     }
// }


// Problem - 5 
// Seeding

// Example:
// Input: ‘N’ = 3

// Output: 
// * * *
// * *
// *


// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         for(int i = n;i >= 1;i--)
//         {
//             for(int j = 1;j <= i;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
           
//     }
// }


// Problem - 6
// Reverse Number Triangle

// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         for(int i = 0;i < n;i++)
//         {
//             for(int j = 1;j <= n-i;j++)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }

           
//     }
// }


// Problem - 7
//  Star Triangle

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         int k = 1;
//         for(int i = n-1;i >= 0;i--)
//         {

//            //   *   
//            //  ***  
//            // *****
//            for(int j = i;j >= 1;j--)
//            {
//                System.out.print(" "); 
               
//            }
//            for(int l = 0;l < k;l++)
//            {
//                System.out.print("*");
//            }
            
//             k += 2;
//             System.out.println();


//         }

           
//     }
// }


// Problem - 8
// Reverse Star Traingle

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         // *******
//         //  *****
//         //   *** 
//         //    *  
//         int count = 1;

//         for(int i = 1;i < n;i++)
//         {
//             count += 2;
//         }

//         int spaceCount = 0;

//         for(int i = 0;i < n;i++)
//         {
//             for(int j = spaceCount;j >= 1;j--)
//             {
//                 System.out.print(" ");
//             }

//             for(int k = count;k >= 1;k--)
//             {
//                 System.out.print("*");
//             }

//             for(int j = spaceCount;j >= 1;j--)
//             {
//                 System.out.print(" ");
//             }

//             System.out.println();

//             spaceCount++;
//             count -= 2;

//         }
           
//     }
// }


// Problem - 9
// Star Diamond

// Example:
// Input: ‘N’ = 3

// Output: 

//   *
//  ***
// *****
// *****
//  ***
//   *

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         // Write your code here
//         int sCount = 1;
        
//         for(int i = 1;i <= n;i++)
//         {
//             for(int j = i;j < n;j++)
//             {
//                 System.out.print(" ");
//             }

//             for(int k = sCount;k >= 1;k--)
//             {
//                 System.out.print("*");
//             }

//             System.out.println();
//             sCount += 2;
//         }

//         sCount -= 2;
//         int spaceCount = 0;

//         for(int i = 0;i < n;i++)
//         {
//             for(int j = spaceCount;j >= 1;j--)
//             {
//                 System.out.print(" ");
//             }

//             for(int k = sCount;k >= 1;k--)
//             {
//                 System.out.print("*");
//             }

//             for(int j = spaceCount;j >= 1;j--)
//             {
//                 System.out.print(" ");
//             }

//             System.out.println();
//             sCount -= 2;
//             spaceCount += 1;

//         }

           
//     }
// }


// Problem - 10
// Rotated Triangle 
// *    
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         for(int i = 1;i <=(n*2)-1;i++)
//         {
//             if(i <= n)
//             {
//                 for(int j = i;j >= 1;j--)
//                 {
//                     System.out.print("*");
//                 }
//                 for(int k = i;k < n;k++)
//                 {
//                     System.out.print(" ");
//                 }

//                 System.out.println();
//             }
//             else
//             {
//                 for(int l = (2*n)-i;l >= 1;l--)
//                 {
//                     System.out.print("*");
//                 }


//                 for(int m = (2*n)-i;m < 3;m++)
//                 {
//                     System.out.print(" ");
//                 }

//                 System.out.println();
                
//             }


//         }

           
//     }
// }


// Problem - 11
// Binary Number Triangle

// 1
// 0 1 
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         int bin0 = 0;
//         int bin1 = 1;

//         for(int i = 1;i <= n;i++)
//         {
//             if(i == 1)
//             {
//                 System.out.println(i);
//             }
//             else if(i%2 == 0)
//             {
//                 bin0 = 0;
//                 for(int j = i;j >= 1;j--)
//                 {
//                     System.out.print(bin0+" ");
//                     if(bin0 == 0)
//                         bin0 += 1;
//                     else
//                         bin0 -= 1;
//                 }

//                 System.out.println();
//             }
//             else
//             {
//                 bin1 = 1;
//                 for(int j = i;j >= 1;j--)
//                 {
//                     System.out.print(bin1+" ");
//                     if(bin1 == 1)
//                         bin1 -= 1;
//                     else
//                         bin1 += 1;
//                 }

//                 System.out.println();
//             }
            

//         }
           
//     }
// }


// Problem - 12

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         // Write your code here.
  
//     //    1    1
//     //    12  21
//     //    123321
//     //   
//     int spaceCount = (n*2)-3;

//     for(int i = 1;i <= n;i++)
//     {
//         for(int j = 1;j <= i;j++)
//         {
//             System.out.print(j+" ");
//         }

//         for(int k = spaceCount;k >= 1;k--)
//         {
//             System.out.print(" ");
//         }
//         spaceCount -= 2;

//         for(int l = i;l >= 1;l--)
//         {
//             System.out.print(l+" ");
//         }

//         System.out.println();
//     }
           
//     }
// }


// Problem - 13
// Increasing Number Traingle

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         int num = 1;
//         for(int i = 1;i <= n;i++)
//         {
//             for(int j = i;j >= 1;j--)
//             {
//                 System.out.print(num+++" ");
//             }

//             System.out.println();
//         }
           
//     }
// }


// Problem - 14
// Increasing Letter Traingle

// A 
// A B
// A B C
// A B C D
// A B C D E

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

        
//         for(int i = 1;i <= n;i++)
//         {
//             char charPrint = 'A';
//             for(int j = i;j >= 1;j--)
//             {
//                 System.out.print(charPrint+++" ");
//             }
//             System.out.println();
//         }
           
//     }
// }


// Problem - 15
// Reverse Letter Triangle
// A B C D E 
// A B C D
// A B C
// A B
// A

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         for(int i = n;i >= 1;i--)
//         {
//             char charPrint = 'A';
//             for(int j = i;j >= 1;j--)
//             {
//                 System.out.print(charPrint+++" ");
//             }

//             System.out.println();
//         }
           
//     }
// }


// Problem - 16
// Alpha-Ramp
// A 
// B B
// C C C
// D D D D
// E E E E E

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         char charPrint = 'A';

//         for(int i = 1;i <= n;i++)
//         {
//             for(int j = i;j >= 1;j--)
//             {
//                 System.out.print(charPrint+" ");
//             }
//             charPrint++;
//             System.out.println();
//         }
           
//     }
// }

// Problem - 17
// Alpha Triangle

// E 
// E D
// E D C
// E D C B
// E D C B A

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         for(int i = n;i >= 1;i--)
//         {
//             int charPrint = 'A' + n-1;
//             for(int j = i; j <= n;j++)
//             {
//                 System.out.print((char)charPrint--+" ");
//             }

//             System.out.println();
//         }
           
//     }
// }



// Problem - 18
// Alpha Hill

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//          // Write your code here
//     //
//     //
//     //         A    
//     //       A B A  
//     //     A B C B A
//     int spaceCount = (n*2)-2;

//     for(int i = 1;i <= n;i++)
//     {
//         char charPrint = 'A';
//         for(int j = 1;j <= spaceCount;j++)
//         {
//             System.out.print(" ");
//         }

//         for(int k = i;k >= 1;k--)
//         {
//             System.out.print(charPrint+" ");
//             if(k != 1)
//             {
//                 // System.out.print(" ");
//                 charPrint++;
//             }
//             else
//             {
//                 charPrint--;
//                 if(i != 1)
//                 {
//                     int temp = i;
//                     for(int l = i;l >= 2;l--)
//                     {
//                         System.out.print(charPrint);
//                         charPrint--;
//                         if(l != 1)
//                         {
//                             System.out.print(" ");
//                         }
//                     }
//                 }
//             }
//         }

//         for(int j = 1;j <= spaceCount;j++)
//         {
//             System.out.print(" ");
//         }

//         spaceCount -= 2;
//         System.out.println();

//     }

           
//     }
// }



// Problem - 18
// Alpha Triangle

// E 
// E D
// E D C
// E D C B
// E D C B A

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         for(int i = n;i >= 1;i--)
//         {
//             int charPrint = 'A' + n-1;
//             for(int j = i; j <= n;j++)
//             {
//                 System.out.print((char)charPrint--+" ");
//             }

//             System.out.println();
//         }
           
//     }
// }

// Problem - 19

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;

//         // Write your code here
//         int colCount = n;
//         int spaceCount = 0;

// //      * * * * * *
// //      * *     * *
// //      *         *
// //      *         *
// //      * *     * *
// //      * * * * * *
// //

//         for(int i = n;i >= 1;i--)
//         {
//             for(int j = i;j >= 1;j--)
//             {
//                 System.out.print("* ");
//             }

//             for(int k = spaceCount;k >= 1;k--)
//             {
//                 System.out.print(" ");
//             }

//             if(spaceCount == 0)
//                 spaceCount = (n*2)-2;
//             else if(i <= n)
//                 spaceCount += 4;

//             for(int l = i;l >= 1;l--)
//             {
//                 System.out.print("*");
//                 if(l != 1)
//                     System.out.print(" ");
//             }
    
//             System.out.println();
//         }


//         for(int i = 1;i <= n;i++)
//         {
//             for(int j = i;j >= 1;j--)
//             {
//                 System.out.print("* ");
//             }

//             for(int k = spaceCount;k >= 1;k--)
//             {
//                 System.out.print(" ");
//             }

//             spaceCount -= 4;

//             for(int l = i;l >= 1;l--)
//             {
//                 System.out.print("*");
//                 if(l != 1)
//                     System.out.print(" ");
//             }

//             System.out.println();

//         }

//     }
// }

// Problem - 20
// Symmetry 


public class Patterns_All
{
    public static void main(String[] args)
    {
        int n = 4;

        // Write your code here

//    *         *
//    * *     * *
//    * * * * * *
//    * *     * *
//    *         *

    	int spaceCount = (n*2)+2;

        for(int i = 1;i <= n;i++)
        {
            for(int j = i;j >= 1;j--)
            {
                System.out.print("* ");
            }
            
            for(int k = spaceCount;k >= 1;k--)
            {
                System.out.print(" ");
            }
  
            spaceCount -= 4;
  
            for(int l = i;l >= 1;l--)
            {
                System.out.print("* ");
            }
  
            System.out.println();
        }
  
        spaceCount = (n*2)-2;
  
        for(int i = n-1;i >= 1;i--)
        {
            for(int j = i;j >= 1;j--)
            {
                System.out.print("* ");
            }
  
            for(int k = spaceCount;k >= 1;k--)
            {
                System.out.print(" ");
            }
  
            spaceCount += 4;
  
            for(int l = i;l >= 1;l--)
            {
                System.out.print("* ");
            }
  
            System.out.println();
        }
          
           
    }
}

// Problem - 21

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;
           
//     }
// }




// Problem - 22

// public class Patterns_All
// {
//     public static void main(String[] args)
//     {
//         int n = 5;
           
//     }
// }




