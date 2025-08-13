
// PORBLEM -- Two_Sum_1

// -It is of two varieties 
// 1.They will give array and target and we need to answer as Yes/No if there are any values (a+b) = target 
// 2.They will give array and target and we need to give the array of {a , b} which could add up to the target 

// ----------------------------------------------------------------------------------------

// Method - I :- Brute Force (Using two nested for loops)
// Time Complexity :- O(n2) nearly about n2 but we need to take it as n2
// Space Comlpexity :- 

// SELF  - CAN DO IT EASILY 

// ----------------------------------------------------------------------------------------

// Method - II :- Better Approach (Using hashing)
// Time Complexity :- O(n)
// Space Comlpexity :- O(n)

// import java.util.*;

// public class Two_Sum_1 {

//     public static int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         int resArr[] = new int[2];

//         HashMap<Integer, Integer> hash = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             int temp = nums[i];

//             int remain = target - temp;

//             if (hash.containsKey(remain)) {
//                 resArr[0] = hash.get(remain);
//                 resArr[1] = i;
//                 break;
//             }

//             hash.put(temp, i);
//         }

//         return resArr;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         int target = sc.nextInt();
//         int arr[] = new int[size];
//         int resArr[] = new int[2];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         resArr = twoSum(arr, target);

//         for (int i = 0; i < 2; i++) {
//             System.out.print(resArr[i] + " ");
//         }

//         sc.close();
//     }
// }

// ----------------------------------------------------------------------------------------

// Method - III :- Optimal Approach (If the interviewer says not to use the Map datastructure then we need to say this one) , unless both the Hashing Method and Towpointers methods are not having that much huge difference in time complexities AND ALSO , IT will works only for variety-I , problems if we have to solve variety-II problems in two pointers then we need to store the indexes using some other datastructure and it will be so hectic and might give higher time complexity , if you want to solve the variety-II problemns then go with the above method-II (using hashing) approach
// Time Complexity :- O(n)
// Space Comlpexity :- O(n)

import java.util.*;

public class Two_Sum_1 {

    public static boolean twoSum(int[] nums, int target) {
        int n = nums.length;
        boolean flag = false;

        Arrays.sort(nums);

        int right = n - 1, left = 0;
        int sum = nums[right] + nums[left];

        while (right > left && left < right) {

            if (sum == target) {
                flag = true;
            } else if (sum > target) {
                right--;
                sum = nums[right] + nums[left];
            } else {
                left++;
                sum = nums[right] + nums[left];
            }

        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (twoSum(arr, target))
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
