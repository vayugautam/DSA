import java.util.Scanner;

public class A_Halloumi_Boxes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            if (k>=2) {
                System.out.println("YES");
            }else{
                boolean isSorted=true;
                for (int j = 0; j < n - 1; j++) {
                    if (a[j + 1] < a[j]) {
                        isSorted = false;
                        break; 
                    }
                }
                if (isSorted) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

    }
}