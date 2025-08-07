import java.util.*;

public class find_the_highest_and_lowest_frequency_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Pre-Calculation using Maps
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (freq.get(arr[i]) == null) {
                freq.put(arr[i], 1);
            } else
                freq.put(arr[i], freq.get(arr[i]) + 1);
        }

        // Fetching the higher Frequency term
        int max = Collections.max(freq.values());
        // System.out.print(max+" ");

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
                break;
            }
        }

        // Fetching the lower frequency term
        int min = Collections.min(freq.values());

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == min) {
                System.out.print(entry.getKey());
            }
        }

        // map.entrySet()
        // entrySet() is a built-in method of Map that returns a Set of all the entries
        // in the map.
        // Each entry is a Map.Entry object.

        // So map.entrySet() gives you something like:

        // [
        // ("apple", 50),
        // ("banana", 30),
        // ("cherry", 80)
        // ]
        // and then we can access the key easily

        sc.close();
    }
}
