import java.util.Scanner;

public class A_Unit_Array {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int countneg=0;
            int countpos=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i]!=1) {
                    countneg++;
                }else countpos++;
            }
            int ans = 0;
            if (countpos<countneg) {
                int diff = countneg - countpos;
                int flip = (diff+1)/2;
                ans += flip;
                countneg -= flip;
                countpos += flip;
            }
            if (countneg % 2 != 0) {
                ans += 1; 
            }

            System.out.println(ans);
        }
        sc.close();
    }
}