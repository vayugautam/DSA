import java.util.*;

public class A_We_Need_the_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int totalXor = 0;
            for (int v : a) {
                totalXor ^= v;
            }

            if (totalXor == 0) {
                System.out.println(0);
            } else {
                if (n % 2 == 1) {
                    System.out.println(totalXor);
                } else {
                    System.out.println(-1);
                }
            }
        }

        sc.close();
    }
}
