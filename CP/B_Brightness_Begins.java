import java.io.*;

public class B_Brightness_Begins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long tt = Long.parseLong(br.readLine());
        while (tt-- > 0) {
            long n = Long.parseLong(br.readLine());
            long left = 1;
            long right = 4000000000000000000L;
            long answer = right;
            while (left <= right) {
                long mid = left + (right - left) / 2;
                long sqrtMid = (long) Math.sqrt(mid);
                if ((sqrtMid + 1) * (sqrtMid + 1) <= mid) {
                    sqrtMid++;
                }
                if (sqrtMid * sqrtMid > mid) {
                    sqrtMid--;
                }
                long on = mid - sqrtMid;
                if (on < n) {
                    left = mid + 1;
                } else {
                    answer = mid;
                    right = mid - 1;
                }
            }
            System.out.println(answer);
        }
    }
}