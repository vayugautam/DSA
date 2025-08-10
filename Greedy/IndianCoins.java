import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount=590;
        int count=0;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(coins, Comparator.reverseOrder());
        for (int i = 0; i < coins.length; i++) {
            if (coins[i]<=amount) {
                while (coins[i]<=amount) {
                    amount -= coins[i];
                    count++;
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("total minimum coins used : " + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
