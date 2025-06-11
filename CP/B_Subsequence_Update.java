import java.util.*;

public class B_Subsequence_Update {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        List<Long> results = new ArrayList<>();

        while (t-- > 0) {
            int n = sc.nextInt();  
            int l = sc.nextInt() - 1;  // Convert to 0-based index
            int r = sc.nextInt() - 1;  // Convert to 0-based index
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Separate elements into inside and outside the segment
            List<Integer> inside = new ArrayList<>();
            List<Integer> outside = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                if (i >= l && i <= r) {
                    inside.add(a[i]);
                } else {
                    outside.add(a[i]);
                }
            }

            // Sort inside in descending order and outside in ascending order
            inside.sort(Collections.reverseOrder());
            outside.sort(null); // Sort in natural order (ascending)

            // Replace elements in inside with smaller elements from outside
            int minLength = Math.min(inside.size(), outside.size());
            for (int i = 0; i < minLength; i++) {
                if (inside.get(i) > outside.get(i)) {
                    inside.set(i, outside.get(i));
                } else {
                    break;  // No need to continue if inside[i] <= outside[i]
                }
            }

            // Calculate the minimum sum of the modified inside segment
            long minSum = 0;
            for (int num : inside) {
                minSum += num;
            }
            results.add(minSum);
        }

        // Output all results
        for (long res : results) {
            System.out.println(res);
        }
        sc.close();
    }
}