import java.util.Scanner;
public class A_Adjacent_Digit_Sums {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (y == x + 1) {
                System.out.println("Yes");
            } else if (y < x) {
                int diff = x - y + 1; 
                if (diff % 9 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}

    