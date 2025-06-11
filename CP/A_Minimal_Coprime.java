import java.util.Scanner;

public class A_Minimal_Coprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int l = sc.nextInt(); 
            int r = sc.nextInt(); 
            if (l==1 && r==1) {
                System.out.println(1);
            }
            else if (l == r) {
                System.out.println(0); 
            } else {
                System.out.println(r - l); 
            }
        }
        sc.close();
    }
}