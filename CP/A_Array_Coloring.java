import java.util.Scanner;

public class A_Array_Coloring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int oddcount=0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                if (a[i]%2!=0) {
                    oddcount++;
                }
            }
            if (oddcount%2!=0) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}