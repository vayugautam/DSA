import java.util.Scanner;

public class B_Having_Been_a_Treasurer_in_the_Past_I_Help_Goblins_Deceive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); 
            String s = sc.next(); 
            if (n < 3) {
                System.out.println(0);
                continue;
            }

            int countDash = 0, countUnderscore = 0;
            for (char c : s.toCharArray()) {
                if (c == '-') {
                    countDash++;
                } else {
                    countUnderscore++;
                }
            }
            if (countDash < 2 || countUnderscore == 0) {
                System.out.println(0);
                continue;
            }
            long left = countDash / 2;         
            long right = countDash - left;       
            long maxSubsequences = countUnderscore * left * right;
            
            System.out.println(maxSubsequences);
        }
        sc.close();
    }
}
