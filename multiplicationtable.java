import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        System.out.println("enter you number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++) {
            System.out.println(n + "*"+ i + "=" + i*n);
        }
        sc.close();
    }
    
}
