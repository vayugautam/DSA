import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class A_Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            HashMap<Long, Long> frequencyMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long key = a[i];
                frequencyMap.put(key, frequencyMap.getOrDefault(key, 0L) + 1);
            }
            if(frequencyMap.size() >= 3) {
                System.out.println("No");
            } else {
                if(frequencyMap.size() == 1) {
                    System.out.println("Yes");
                } else { 
                    ArrayList<Long> freqs = new ArrayList<>(frequencyMap.values());
                    long freq1 = freqs.get(0);
                    long freq2 = freqs.get(1);
                    if(freq1 == freq2) {
                        System.out.println("Yes");
                    } else if(n % 2 == 1 && Math.abs(freq1 - freq2) == 1) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
        sc.close();
    }
}
