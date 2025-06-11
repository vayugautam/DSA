import java.util.Scanner;

public class A_Cover_in_Water {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean conti = false;
            int total=0;
            for(int i = 0;i<n;i++){
                if (s.charAt(i)=='.' && i + 1 < n && s.charAt(i+1)=='.' && i + 2 < n && s.charAt(i+2)=='.') {
                    conti = true;
                    break;
                }
                if (s.charAt(i)=='.') {
                    total++;
                }
            }
            if (conti) {
                System.out.println(2);
            } else {
                System.out.println(total);
            }
        }
    }
}