import java.util.*;

public class A_Coin_Transformation {
    static HashMap<Long, Long> memo = new HashMap<>();
    static long maxCoins(long n) {
        if (n <= 3) return 1;  // Base case: no transformation possible
        if (memo.containsKey(n)) return memo.get(n); // Return if already computed
        
        long result = 2 * maxCoins(n / 4); // Apply transformation
        memo.put(n, result); // Store result for future reference
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        StringBuilder output = new StringBuilder(); // Using StringBuilder for fast output

        while (t-- > 0) {
            long n = sc.nextLong();
            output.append(maxCoins(n)).append("\n"); 
        }
        
        System.out.print(output); 
        sc.close();
    }
}
