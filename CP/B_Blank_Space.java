import java.util.*;

public class B_Blank_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int count = 0;
            int lbs=0;
            for(int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    count++;
                }else{
                    lbs = Math.max(lbs, count);
                    count=0;
                }
            }
            lbs = Math.max(lbs, count);
            System.out.println(lbs);
        }
    }

}
                  