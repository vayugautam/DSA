import java.util.Scanner;

public class A_Final_Verdict {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                s+=a[i];
            }
            if (s==(n*x)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}