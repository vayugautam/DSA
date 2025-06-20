import java.util.Scanner;

public class sumtakinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("value of sum equals");
        System.out.println(sum);
        sc.close();


    }
    
}
