import java.util.Scanner;

public class A_Only_One_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String xstr = sc.next();
            char mind = '9'; 
            for (char c : xstr.toCharArray()) {
                if (c < mind) {
                    mind = c;
                }
            }
            System.out.println(mind);
        }
        sc.close();
    }
}