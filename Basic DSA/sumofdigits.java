import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits = sc.nextInt();
        System.out.println("The sum is : "+ sumDigits(digits));
        sc.close();
    }

    public static int sumDigits(int n) {
        int sumofdigits=0;
        while(n>0){
            int lastdigit = n%10;
            sumofdigits+=lastdigit;
            n/=10;
        }
        return sumofdigits;
    }
    
}
