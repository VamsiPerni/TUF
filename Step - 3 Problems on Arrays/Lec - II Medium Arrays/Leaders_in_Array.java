
// -------------------------------------------------------------------------------------
// Leaders in an Array by Code studio :- https://www.naukri.com/code360/problems/leaders-in-an-array_873144?leftPanelTabValue=PROBLEM 

// Desc :- Everything on the right should be smaller in the array , then that element is considered as leader 

// Method - I :- 
// Time Complexity :- 
// Space Comlpexity :- 

import java.util.*; // TRIED - SELF

public class Leaders_in_Array {
    public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
        ArrayList<Integer> resList = new ArrayList<>();

        resList.add(elements.get(n - 1));
        int rightMax = elements.get(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            int temp = elements.get(i);

            if (temp > rightMax) {
                rightMax = temp;
                resList.add(temp);
            }
        }

        Collections.reverse(resList);

        return resList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> resList = new ArrayList<>();

        resList = findLeaders(list, n);

        for (int i = 0; i < resList.size(); i++) {
            System.out.print(resList.get(i) + " ");
        }

        sc.close();
    }
}
