import java.util.Scanner;

public class B_The_Third_Side {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum+=sc.nextInt();

            }
            System.out.println(sum - n + 1);
        }
    }
}