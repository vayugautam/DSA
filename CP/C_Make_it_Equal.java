import java.io.*;
import java.util.*;

public class C_Make_it_Equal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine());
        List<String> results = new ArrayList<>();
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(st.nextToken());
            }
            int[] b = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
            b[j] = Integer.parseInt(st.nextToken());
            }
            Map<Integer, Integer> fa = new HashMap<>();
            for (int x : a) {
            int r = x % k;
            int base = Math.min(r, k - r);
            fa.put(base, fa.getOrDefault(base, 0) + 1);
            }
            Map<Integer, Integer> fb = new HashMap<>();
            for (int y : b) {
            int r = y % k;
            int base = Math.min(r, k - r);
            fb.put(base, fb.getOrDefault(base, 0) + 1);
            }
            if (fa.equals(fb)) {
            results.add("YES");
            } else {
            results.add("NO");
            }
        }
        for (String res : results) {
            out.println(res);
        }
        out.flush();
    }
}