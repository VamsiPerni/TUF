// Print reverse array in Java using recursion for the given
// input array without using any extra space. Ignore the implicit
// stack used in recursion for computing the space complexity.
// Example :- arr[] = {1,2,3,4}

import java.util.*;

public class reverse_arr_int_recursive {
    public static void reverseArr(int arr[], int start, int end) {

        if (start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArr(arr, ++start, --end);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArr(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

// public static String reverseString(String str, int start, int end) {

// if (start < end) {
// char temp = str.charAt(start);

// str.replace(str.charAt(start), str.charAt(end));
// str.replace(str.charAt(end), temp);

// reverseString(str, start++, end--);
// }

// return str;
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// String str = sc.nextLine();

// str = reverseString(str, 0, str.length() - 1);

// System.out.print(str);

// sc.close();
// }