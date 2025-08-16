
// -------------------------------------------------------------------------------------
// 31. Next Permutation (Leetcode)

// Method - I :-
// Time Complexity :- 
// Space Comlpexity :-
// YoutubeLink :- https://www.youtube.com/watch?v=JDOXKqF60RQ
// Notebook :- 31 page :- 31/2 PDF 

import java.util.*;

public class Next_Permutation_31 {

    public static void recurPer(List<List<Integer>> ans, List<Integer> ds, int[] nums, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPer(ans, ds, nums, freq);
                freq[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static List<List<Integer>> perumutate(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];

        recurPer(ans, ds, nums, freq);

        return ans;
    }

    public static void nextPermutation(int[] nums) {

        // Generating-all the permuatattions
        List<List<Integer>> resPer = new ArrayList<>();

        resPer = perumutate(nums);

        // checcking the next perumutation
        List<Integer> given = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            given.add(nums[i]);
        }

        List<List<Integer>> givenFin = new ArrayList<>();
        givenFin.add(new ArrayList<>(given));

        int flag = -1;
        for (int i = 0; i < resPer.size(); i++) {
            if (resPer.get(i).equals(givenFin.get(0))) {
                flag = i;
            }
        }

        // Printing the Result
        if (flag == resPer.size() - 1) {
            System.out.print(resPer.get(0));
        } else {
            System.out.print(resPer.get(flag + 1));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextPermutation(arr);

        sc.close();
    }
}
