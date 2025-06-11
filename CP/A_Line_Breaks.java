import java.util.Scanner;

public class A_Line_Breaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();  
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = sc.nextLine();  
            }
            int currentLength = 0;
            int x = 0;
            for (int i = 0; i < n; i++) {
                int wordLength = words[i].length();
                if (currentLength + wordLength <= m) {
                    currentLength += wordLength;
                    x++;
                } else {
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
