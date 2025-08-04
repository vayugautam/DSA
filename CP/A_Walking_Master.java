import java.util.Scanner;

public class A_Walking_Master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dx = sc.nextInt();
            int dy = sc.nextInt();
            if (dy < y) {
                System.out.println(-1);
                continue;
            }
            int moves = dy - y;
            x += moves;
            if (x < dx) {
                System.out.println(-1);
                continue;
            }
            moves += (x - dx);
            System.out.println(moves);
        }

        sc.close();
    }
}
