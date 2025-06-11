import java.util.Scanner;

public class C_XOR_and_Triangle {
    static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (isPowerOfTwo(x) || isPowerOfTwo(x + 1)) {
                System.out.println("-1");
                continue;
            }
            int p = 1;
            while (p * 2 < x) {
                p *= 2;
            }
            int y = p - 1; 
            System.out.println(y);
        }
        sc.close();
    }
}