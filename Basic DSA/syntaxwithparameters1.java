import java.util.Scanner;

public class syntaxwithparameters1 {
    public static void calculateSum(int a,int b) {
        
        int sum = a+b;
        System.out.println("sum is : "+sum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        calculateSum(a,b);
        sc.close();
    }
        
}
