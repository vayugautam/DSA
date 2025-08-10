import java.util.StringTokenizer;
import java.io.*;
import java.lang.StringBuilder;
import java.util.*;

public class A_Lever {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-->0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer sta = new StringTokenizer(br.readLine());
            StringTokenizer stb = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int i =0;i<n;++i){
                int a = Integer.parseInt(sta.nextToken());
                int b = Integer.parseInt(stb.nextToken());
                if (a>b) {
                    sum=sum+(a-b);
                }
            }
            out.append(sum+1).append('\n');
        }
        System.out.print(out.toString());
    }
}
