import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Alternating_Sum_of_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
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

            System.out.println(sum);
        }
    }
}