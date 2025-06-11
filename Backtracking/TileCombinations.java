import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TileCombinations {
    static final int MOD = 998244353;
    static final int MAX_VALUE = 1 << 13; 

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(System.out)) {

            int initialTiles = 101000;
            int targetScore = Integer.parseInt(br.readLine());

            int[][] dp = new int[MAX_VALUE + 1][targetScore + 1];
            dp[2][0] = initialTiles; 

            for (int value = 2; value <= MAX_VALUE; value <<= 1) {
                for (int score = 0; score <= targetScore; score++) {
                    
                    int tiles = dp[value][score];
                    if (tiles == 0) continue;

                    int nextValue = value << 1;
                    int nextScore = score + nextValue;

                    if (nextScore <= targetScore) {
                        dp[nextValue][nextScore] = (dp[nextValue][nextScore] + tiles / 2) % MOD;
                        dp[value][score] = (dp[value][score] + tiles / 2) % MOD; // Remaining tiles
                    }
                }
            }

            int distinctConfigs = 0;
            for (int score = 0; score <= targetScore; score++) {
                distinctConfigs = (distinctConfigs + dp[MAX_VALUE][score]) % MOD;
            }

            pw.println(distinctConfigs);
        }
    }
}


