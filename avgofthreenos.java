import java.util.Scanner;

public class avgofthreenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter value of c");
        int c = sc.nextInt();

        float avg = ((a + b + c)/3);
        System.out.println("value of avg equals");
        System.out.println(avg);
        sc.close();


    }
    
}
    

