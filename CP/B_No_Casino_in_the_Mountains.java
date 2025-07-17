import java.util.Scanner;

public class B_No_Casino_in_the_Mountains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int hike = 0;
            int len=0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0) {
                    len++;
                } else {
                    hike+=(len+1)/(k+1);
                    len = 0;
                }
            }
            hike+=(len+1)/(k+1);
            System.out.println(hike);
        }
        sc.close();
    }
}