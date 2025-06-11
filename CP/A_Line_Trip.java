import java.util.ArrayList;
import java.util.Scanner;

public class A_Line_Trip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            ArrayList<Integer> points = new ArrayList<>();
            points.add(0);
            for (int i = 0; i < n; i++) {
                points.add(sc.nextInt());
            }
            points.add(x);
            
            int size = points.size();
            int maxi = Integer.MIN_VALUE;
            for (int i = 1; i < size; i++){
                if (i == size - 1) {
                    maxi = Math.max(maxi, 2 * (points.get(i) - points.get(i - 1)));
                } else {
                    maxi = Math.max(maxi, points.get(i) - points.get(i - 1));
                }
            }
            System.out.println(maxi);
        }
        sc.close();
    }
}
