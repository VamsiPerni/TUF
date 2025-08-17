
// -------------------------------------------------------------------------------------
// 31. Next Permutation (Leetcode)

// Method - I :- Brute Force Method (for vs code work only)
// Time Complexity :- 
// Space Comlpexity :-
// YoutubeLink :- https://www.youtube.com/watch?v=JDOXKqF60RQ
// Notebook :- 31 page :- 31/2 PDF 

// import java.util.*;

// public class Next_Permutation_31 {

//     public static void recurPer(List<List<Integer>> ans, List<Integer> ds, int[] nums, boolean[] freq) {
//         if (ds.size() == nums.length) {
//             ans.add(new ArrayList<>(ds));
//             return;
//         }

//         for (int i = 0; i < nums.length; i++) {
//             if (!freq[i]) {
//                 freq[i] = true;
//                 ds.add(nums[i]);
//                 recurPer(ans, ds, nums, freq);
//                 freq[i] = false;
//                 ds.remove(ds.size() - 1);
//             }
//         }
//     }

//     public static List<List<Integer>> perumutate(int[] nums) {

//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> ds = new ArrayList<>();
//         boolean freq[] = new boolean[nums.length];

//         recurPer(ans, ds, nums, freq);

//         return ans;
//     }

//     public static void nextPermutation(int[] nums) {

//         // Generating-all the permuatattions
//         int[] perArr = Arrays.copyOf(nums, nums.length);
//         Arrays.sort(perArr);

//         List<List<Integer>> resPer = new ArrayList<>();
//         resPer = perumutate(perArr);

//         // checcking the next permutation
//         List<Integer> given = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             given.add(nums[i]);
//         }

//         List<List<Integer>> givenFin = new ArrayList<>();
//         givenFin.add(new ArrayList<>(given));

//         int flag = -1;
//         for (int i = 0; i < resPer.size(); i++) {
//             if (resPer.get(i).equals(givenFin.get(0))) {
//                 flag = i;
//             }
//         }

//         // Printing the Result
//         if (flag == resPer.size() - 1) {
//             System.out.print(resPer.get(0));
//         } else {
//             System.out.print(resPer.get(flag + 1));
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         nextPermutation(arr);

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 31. Next Permutation (Leetcode) 

// Method - I :- Brute Force Method (for leetcode work only) works fine for the small input numbers but when we give the input length more than 6 then it will cause memory limit exceeded as leetcode has constrains so here it comes the Better Approach 

// Time Complexity :-  O(n!) * O(n) 
// Space Comlpexity :-

// YoutubeLink :- https://www.youtube.com/watch?v=JDOXKqF60RQ
// Notebook :- 31 page :- 31/2 PDF 

// import java.util.*;

// public class Next_Permutation_31 {

//     public static void recurPer(List<List<Integer>> ans, List<Integer> ds, int[] nums, boolean[] freq) {
//         if (ds.size() == nums.length) {
//             ans.add(new ArrayList<>(ds));
//             return;
//         }

//         for (int i = 0; i < nums.length; i++) {
//             if (!freq[i]) {
//                 freq[i] = true;
//                 ds.add(nums[i]);
//                 recurPer(ans, ds, nums, freq);
//                 freq[i] = false;
//                 ds.remove(ds.size() - 1);
//             }
//         }
//     }

//     public static List<List<Integer>> perumutate(int[] nums) {

//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> ds = new ArrayList<>();
//         boolean freq[] = new boolean[nums.length];

//         recurPer(ans, ds, nums, freq);

//         return ans;
//     }

//     public static void nextPermutation(int[] nums) {

//         // Generating-all the permuatattions
//         int[] perArr = Arrays.copyOf(nums, nums.length);
//         Arrays.sort(perArr);

//         List<List<Integer>> resPer = new ArrayList<>();
//         resPer = perumutate(perArr);

//         // checcking the next permutation
//         List<Integer> given = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             given.add(nums[i]);
//         }

//         List<List<Integer>> givenFin = new ArrayList<>();
//         givenFin.add(new ArrayList<>(given));

//         int flag = -1;
//         for (int i = 0; i < resPer.size(); i++) {
//             if (resPer.get(i).equals(givenFin.get(0))) {
//                 flag = i;
//             }
//         }

//         // Printing the Result
//         if (flag == resPer.size() - 1) {
//             // System.out.print(resPer.get(0));
//             List<Integer> temp = new ArrayList<>(resPer.get(0));

//             for (int i = 0; i < nums.length; i++) {
//                 nums[i] = temp.get(i);
//             }

//         } else {
//             // System.out.print(resPer.get(flag + 1));
//             List<Integer> temp = new ArrayList<>(resPer.get(flag + 1));

//             for (int i = 0; i < nums.length; i++) {
//                 nums[i] = temp.get(i);
//             }
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         nextPermutation(arr);

//         sc.close();
//     }
// }

// -------------------------------------------------------------------------------------
// 31. Next Permutation (Leetcode) 

// Method - I :- Better Approach (There is {next_permutation} STL in C++ which we can use that and simply solve the solution) 
// Time Complexity :-  
// Space Comlpexity :-
// YoutubeLink :- https://www.youtube.com/watch?v=JDOXKqF60RQ

// -------------------------------------------------------------------------------------
// 31. Next Permutation (Leetcode) 

// Method - I :- Optimal Approach (without usign any in-built method we are implmenting the optimal approach for the next_permutation problem here )

// Time Complexity :- O(3n) 
// Space Comlpexity :- O(n)
// YoutubeLink :- https://www.youtube.com/watch?v=JDOXKqF60RQ

import java.util.*;

public class Next_Permutation_31 {

    public static void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            Arrays.sort(nums);
            return;
        }

        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }

        Arrays.sort(nums, idx + 1, n); // we can perfrom {reverse} or-esle sort over here
        return;
    }

    public static void swap(int[] nums, int idx, int n) {
        int temp = nums[idx];
        nums[idx] = nums[n];
        nums[n] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextPermutation(arr);

        System.out.print("[");

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.print(arr[n - 1]);

        System.out.print("]");

        sc.close();
    }
}
