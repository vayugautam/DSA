import java.util.Scanner;

public class A_Quintomania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            boolean isPerfect = true;
            for(int j=1;j<n;j++){
                int interval = Math.abs(a[j]-a[j-1]);
                if (interval!=5 && interval!=7) {
                    isPerfect=false;
                    break;
                }
            }
            if (isPerfect) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}