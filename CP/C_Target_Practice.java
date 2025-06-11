import java.util.Scanner;

public class C_Target_Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        final int[][] SCORE = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        for (int test = 0; test < t; test++) {
            int totalScore = 0;
            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine().trim();
                for (int j = 0; j < 10; j++) {
                    if (line.charAt(j) == 'X') {
                        totalScore += SCORE[i][j];
                    }
                }
            }
            System.out.println(totalScore);
        }
    }
}