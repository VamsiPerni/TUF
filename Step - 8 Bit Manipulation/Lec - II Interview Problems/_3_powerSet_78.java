// -------------------------------------------------------------------------------------
//  Desc :-Power Set (78.Subsets)

// Below code steps in detailed understanding ->

// Method - I :- By using Bit Manipulation , there is one method by using recursions , where both are having same time complexities but the recusive one will cosume some more space complexity

// Time Complexity :- O(n*pow(2,n))
// Space Comlpexity :- O(pow(2,3) * n)

import java.util.*; // TUF

public class _3_powerSet_78 {
    public static List<List<Integer>> subsets(int[] nums) {
        int subsets = 1 << nums.length;

        List<List<Integer>> list = new ArrayList<>(); // SC = pow(2,n);

        for (int i = 0; i < subsets; i++) { // TC = pow(2,n)

            List<Integer> tempList = new ArrayList<>(); // SC = n

            for (int j = 0; j < nums.length; j++) { // TC = n
                if ((i & (1 << j)) != 0) { // this is the same condition from , to check whether the bit is set bit or
                                           // not
                    tempList.add(nums[j]);
                }
            }
            list.add(tempList);
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> res = new ArrayList<>();
        res = subsets(nums);

        System.out.println(res);

        sc.close();
    }
}
