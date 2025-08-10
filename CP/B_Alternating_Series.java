import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Alternating_Series {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            for (int i = 1; i <= n; ++i) {
                int val;
                if ((i & 1) == 1) { 
                    val = -1;
                } else {
                    if (i==n) {
                        val=2;
                    }else{
                        val=3;
                    }
                }
                out.append(val);
                if (i<n) {
                    out.append(' ');
                } 
            }
            out.append('\n');
        }
        System.out.print(out.toString());
    }
}