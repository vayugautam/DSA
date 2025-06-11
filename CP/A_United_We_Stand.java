import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class A_United_We_Stand {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] tokens = br.readLine().split(" ");
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i]=Long.parseLong(tokens[i]);
            }
            long mx = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i]>mx) {
                    mx=a[i];
                }
            }
            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (a[i]!=mx) {
                    b.add(a[i]);
                }else{
                    c.add(a[i]);
                }
            }
            if (b.isEmpty()) {
                out.println(-1);
            } else {
                out.println(b.size() + " " + c.size());
                for (Long num : b) {
                    out.print(num + " ");
                }
                out.println();
                for (Long num : c) {
                    out.print(num + " ");
                }
                out.println();
            }
        }
        out.flush();
        out.close();
    }
}
