import java.util.Scanner;

public class A_New_World_New_Me_New_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();  // Length of array
            int k = sc.nextInt();  // Required sum
            int p = sc.nextInt();  // Bound of values (-p to p)
            
            int minSum = -n * p;
            int maxSum = n * p;
            
            if (k < minSum || k > maxSum) {
                System.out.println(-1);  
                continue;
            }
            int absK = Math.abs(k);
            int operations = absK / p;  
            if (absK % p != 0) {
                operations++;  
            }
            System.out.println(operations);
        }
        sc.close();
    }
}