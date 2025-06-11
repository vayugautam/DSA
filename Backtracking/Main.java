import java.io.*;
import java.util.*;

public class Main {
    // Fast input and output handling
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        // Read input
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            // For each test case, implement your solution logic here

            BufferedReader br;
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sum = 0;
            boolean add = true; // Start with addition

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (add) {
                    sum += num;
                } else {
                    sum -= num;
                }
                add = !add; // Toggle between addition and subtraction
        }
        
        out.flush();
    }
}
