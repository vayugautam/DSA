import java.util.Scanner;

public class A_Skibidus_and_Amog_u {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->=0) {
            String s = sc.nextLine().trim();
            String plural = convertplural(s);
            System.out.println(plural);
        }
    }
    public static String convertplural(String s) {
        if (s.endsWith("us")) {
            return s.substring(0, s.length()-2)+"i";
        }
        return s;
    }
}