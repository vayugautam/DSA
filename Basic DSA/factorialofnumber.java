import java.util.Scanner;

public class factorialofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive integer:");
        int n = sc.nextInt();
        int fact = 1;
        

        for(int i=1;i<=n;i++){
            fact*=i;
        }

        System.out.println("Factorial: "+ fact);
        sc.close();
    }
    
}
