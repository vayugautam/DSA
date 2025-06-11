import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class B_Vicious_Labyrinth {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter p = new PrintWriter(System.out);
        int t = Integer.parseInt(b.readLine());
        while (t-->0) {
            String[] l = b.readLine().split(" ");
            int n = Integer.parseInt(l[0]);
            int k = Integer.parseInt(l[1]);
            int[] a = new int[n + 1];
            if (n == 2) {
                p.println("2 1");
            }
            else{
                a[n-1]=n;
                a[n]=n - 1;
                if (k%2==1) {
                    for(int i = 1;i< n - 1;i++) {
                        a[i]=n;
                    }
                }else{
                    for (int i = 1; i < n - 1; i++) {
                        a[i]=n-1;
                    }
                }
                StringBuilder s = new StringBuilder();
                for (int i = 1; i <=n; i++) {
                    s.append(a[i]).append(" ");
                }
                p.println(s.toString().trim());
            }
        }
        p.close();
    }
}