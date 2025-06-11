import java.util.Scanner;

public class evenornotfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
        sc.close();
    }

    public static boolean isEven(int number) {
        if(number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
        
    }
}
