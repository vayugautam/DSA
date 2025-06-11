import java.util.ArrayList;
import java.util.Scanner;

public class B_Sequence_Game {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            ArrayList<Integer> a = new ArrayList<>();
            a.add(b[0]);
            for (int i = 1; i < n; i++) {
                if (b[i - 1] <= b[i]) {
                    a.add(b[i]);
                } else {
                    a.add(b[i]); 
                    a.add(b[i]); 
                }
            }
            System.out.println(a.size());
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
