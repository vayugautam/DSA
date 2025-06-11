import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class C_Remove_the_Ends {
    static HashMap<Long, Long> memo;
    static int[] a;
    static int n;

    static long dp(int L, int R) {
        if (L > R) return 0;
        long key = (((long)L) << 32) | (R & 0xffffffffL);
        if (memo.containsKey(key)) return memo.get(key);
        long best = 0;
        for (int i = L; i <= R; i++) {
            if (a[i] > 0) {
                long candidate = a[i] + dp(i + 1, R);
                if (candidate > best) best = candidate;
            } else { 
                long candidate = -((long)a[i]) + dp(L, i - 1);
                if (candidate > best) best = candidate;
            }
        }
        memo.put(key, best);
        return best;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine().trim());
            a = new int[n + 1]; // 1-indexed
            String[] parts = br.readLine().trim().split("\\s+");
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(parts[i - 1]);
            }
            memo = new HashMap<>();
            long ans = dp(1, n);
            out.println(ans);
        }
        out.flush();
        out.close();
    }
}