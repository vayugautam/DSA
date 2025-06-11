import java.io.*;
import java.util.*;

public class C_Creating_Keys_for_StORages_Has_Become_My_Main_Skill {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            if(n == 1){
                out.println(x);
                continue;
            }
            if(x == 0){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    sb.append("0 ");
                }
                out.println(sb.toString().trim());
                continue;
            }
            // Compute m0: smallest non-negative integer d that is NOT allowed,
            // i.e. for which (d & ~x) != 0.
            int m0 = 0;
            while (true) {
                if ((m0 & ~x) != 0) break;
                m0++;
            }
            int candidate = Math.min(n, m0);
            int S = 0;
            for (int d = 0; d < candidate; d++) {
                S |= d;
            }
            int forced; 
            if(S == x) {
                forced = candidate;
            } else {
                forced = (candidate == n) ? n - 1 : candidate;
            }
            S = 0;
            for (int d = 0; d < forced; d++) {
                S |= d;
            }
            int missing = x & ~S;
            ArrayList<Integer> res = new ArrayList<>();
            for (int d = 0; d < forced; d++) {
                res.add(d);
            }
            if(missing != 0) {
                res.add(missing);
            }
            while(res.size() < n) {
                res.add(0);
            }
            StringBuilder sb = new StringBuilder();
            for (int num : res) {
                sb.append(num).append(" ");
            }
            out.println(sb.toString().trim());
        }
        out.flush();
        out.close();
    }
}
