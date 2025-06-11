import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            if (x == 0) {
                System.out.println("0 ".repeat(n).trim());
                continue;
            }

            int bestM = 0;
            int low = 1;
            int high = Math.min(n, Integer.MAX_VALUE);

            while (low <= high) {
                int mid = (low + high) / 2;
                int m = mid;

                int s;
                if (m == 0) {
                    s = 0;
                } else {
                    int mMinus1 = m - 1;
                    int highestBit = Integer.highestOneBit(mMinus1);
                    s = (highestBit << 1) - 1;
                }

                if ((s & x) != s) {
                    high = mid - 1;
                    continue;
                }

                int rem = x ^ s;
                boolean possible = false;

                if (rem == 0) {
                    if (m <= n) {
                        possible = true;
                    }
                } else {
                    if (m + 1 <= n && rem != m) {
                        possible = true;
                    }
                }

                if (possible) {
                    bestM = Math.max(bestM, m);
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            List<Integer> result = new ArrayList<>();
            if (bestM > 0) {
                int m = bestM;
                int s;
                if (m == 0) {
                    s = 0;
                } else {
                    int mMinus1 = m - 1;
                    int highestBit = Integer.highestOneBit(mMinus1);
                    s = (highestBit << 1) - 1;
                }
                int rem = x ^ s;

                for (int i = 0; i < m; i++) {
                    result.add(i);
                }
                if (rem != 0) {
                    result.add(rem);
                }
                while (result.size() < n) {
                    result.add(0);
                }
            } else {
                for (int i = 0; i < n; i++) {
                    result.add(x);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int num : result) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}