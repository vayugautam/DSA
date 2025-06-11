import java.util.Scanner;

public class BinaryConcatenation {
    private static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] results = new long[t];

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            results[i] = computeBinaryConcatenation(n);
        }

        for (long result : results) {
            System.out.println(result);
        }
    }

    private static long computeBinaryConcatenation(long n) {
        long result = 0;
        long currentLength = 0; 
        long powerOfTwo = 1; 

        for (long i = 1; i <= n; i++) {
            int binaryLength = Long.toBinaryString(i).length();
            result = (result * modPow(10, binaryLength, MOD) + i) % MOD;
        }

        return result;
    }

    private static long modPow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}