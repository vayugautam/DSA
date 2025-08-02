import java.util.Scanner;

public class A_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            boolean possible = false;
            for (long y = n / k; y >= Math.max(0, n / k - 1); y--) {
                long remaining = n - k * y;
                if (remaining >= 0 && remaining % 2 == 0) {
                    possible = true;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}