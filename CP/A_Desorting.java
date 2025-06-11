import java.util.Scanner;

public class A_Desorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) { 
                a[i] = sc.nextLong();
            }
            long operations = Long.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) { 
                if (a[i] <= a[i + 1]) { 
                    long diff = a[i + 1] - a[i]; 
                    long requiredOperations = diff / 2 + 1;
                    operations = Math.min(operations, requiredOperations);
                } else { 
                    operations = 0;
                }
            }
            
            System.out.println(operations);
        }
        sc.close();
    }
}