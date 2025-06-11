import java.util.Scanner;

public class A_Fibonacciness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();
            int[] possible = {a1+a2,a4-a2,a5-a4};
            int maxi=0;
            for(int a3 : possible){
                int fibonacciness=0;
                if (a3==a1+a2) {
                    fibonacciness++;
                }
                if (a3==a4-a2) {
                    fibonacciness++;
                }
                if (a3==a5-a4) {
                    fibonacciness++;
                }
                maxi=Math.max(maxi, fibonacciness);
            }
            System.out.println(maxi);
        }
    }
}