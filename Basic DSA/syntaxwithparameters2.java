import java.util.Scanner;

public class syntaxwithparameters2 {
    public static int calculateSum(int num1,int num2) {//paramers or formal parameters
        int sum = num1 + num2;   
        return sum;     
    }
    public static void main(String[] args) {//arguments or actual parameters
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("sum is : "+ sum);
        sc.close();

    }

    
}
