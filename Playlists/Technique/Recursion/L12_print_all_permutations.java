// -------------------------------------------------------------------------------------

// 46. Permutations

// Method - I :- Brute Force Approach (By using recursion )
// Time Complexity :-O(n!) * O(n) => O(n!) {for generating all the permutations} * O(n) {for iteratiing everytime from 0 to (n-1)}
// Space Comlpexity :- O(n) + O(n)  => O(n) {for storing the datastructure} + O(n) {for storing the map data structure} 
// YoutubeLink :- https://www.youtube.com/watch?v=YK78FU5Ffjw&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=15
// Note-Book :- 31 --> 31/2 PDF 

import java.util.*;

public class L12_print_all_permutations {

    public static void recurPermutate(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermutate(nums, ans, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];

        recurPermutate(nums, ans, ds, freq);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> resList = new ArrayList<>();

        resList = permute(arr);

        // Printing the results
        System.out.print(resList);

        sc.close();
    }
}

// -------------------------------------------------------------------------------------------------------------------
// 46. Permutations

// Method - I :- Optimal Force Approach (By using recursion , here we will just
// reduce space complexity and the Time complexity is same as before ) // But
// this will not quanratee the lexographical order , If we need it in
// lexographical order(sorted order) then we need to follow the brute force
// method or else we need to sort the final array list in sorted manner

// Time Complexity :-O(n!) * O(n) => O(n!) {for generating all the permutations}
// * O(n) {for iteratiing everytime from 0 to (n-1)}
// Space Comlpexity :- O(n) => O(n) {for storing the datastructure}
// YoutubeLink :-
// https://www.youtube.com/watch?v=f2ic2Rsc9pU&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=15
// Note-Book :- 31 --> 31/2 PDF

// import java.util.*;

// public class L12_print_all_permutations {

// public static void recurPermute(int idx, int[] nums, List<List<Integer>> ans)
// {

// if (idx == nums.length) {
// List<Integer> ds = new ArrayList<>();

// for (int i = 0; i < nums.length; i++) {
// ds.add(nums[i]);
// }

// ans.add(new ArrayList<>(ds));
// return;
// }

// for (int i = idx; i < nums.length; i++) {
// swap(nums, i, idx);
// recurPermute(idx + 1, nums, ans);
// swap(nums, i, idx);
// }
// }

// public static void swap(int[] nums, int i, int idx) {
// int temp = nums[i];
// nums[i] = nums[idx];
// nums[idx] = temp;
// }

// public static List<List<Integer>> permute(int[] nums) {
// List<List<Integer>> ans = new ArrayList<>();

// recurPermute(0, nums, ans);

// return ans;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// List<List<Integer>> resList = new ArrayList<>();

// resList = permute(arr);

// // Printing the results
// System.out.print(resList);

// sc.close();
// }
// }
