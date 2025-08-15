
// -------------------------------------------------------------------------------------
// Stock Buy and Sell

// Method - I :- Brute Force (by using two for loops)
// Time Complexity :- O(n2)
// Space Comlpexity :- O(1)

import java.util.*; // TUF

public class Stock_Buy_and_Sell_121 {

    public static int maxProfit(int[] prices) {
        int maxPro = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    maxPro = Math.max(prices[j] - prices[i], maxPro);
                }
            }
        }

        return maxPro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(maxProfit(arr));

        sc.close();
    }
}

// -------------------------------------------------------------------------------------
// Stock Buy and Sell
// By using Dynamic Programming ,-> If you are selling on ith day then you must
// buy on minimum price from {0 to (i-1)} days

// Method - II :- By using Dynamic Programming
// Time Complexity :-
// Space Comlpexity :-

// import java.util.*; // TUF

// public class Stock_Buy_and_Sell_121 {

// public static int maxProfit(int[] prices) {
// int n = prices.length;
// int buy = prices[0];
// int profit = 0;

// for (int i = 1; i < n; i++) {

// int tempProfit = prices[i] - buy;
// profit = Math.max(tempProfit, profit);
// buy = Math.min(prices[i], buy); // remembering the least buy so it comes
// under dynamic programming
// } // DP is known as remebering the past

// if (profit > 0)
// return profit;

// return 0;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.print(maxProfit(arr));

// sc.close();
// }
// }
