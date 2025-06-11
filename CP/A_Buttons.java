import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A_Buttons {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long annaFree = (c + 1) / 2;
            long katieFree = c / 2;
            long annaTotal = a + annaFree;
            long katieTotal = b + katieFree;
            
            if (annaTotal > katieTotal) {
                out.println("First");
            } else {
                out.println("Second");
            }
        }
        out.flush();
        out.close();
    }
}