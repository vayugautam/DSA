import java.util.Scanner;

public class A_Brogramming_Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean allZero = true, allOne = true;
            for(char c : s.toCharArray()) {
                if (c=='1') {
                    allZero=false;
                }
                if (c=='0') {
                    allOne=false;
                }
            }
            if (allOne) {
                System.out.println(1);
                continue;
            }
            if (allZero) {
                System.out.println(0);
                continue;
            }
            int transition=0;
            for (int i = 0; i< n-1; i++) {
                if (s.charAt(i)!=s.charAt(i+1)) {
                    transition++;
                }
            }
            int result = transition + (s.charAt(0)=='1' ? 1 : 0);
            System.out.println(result);
        }
    }
    
}