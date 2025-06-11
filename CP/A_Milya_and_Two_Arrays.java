import java.util.*;
import java.io.*;

public class A_Milya_and_Two_Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // Length of arrays
            int[] a = new int[n];
            int[] b = new int[n];
            
            String[] aInput = br.readLine().split(" ");
            String[] bInput = br.readLine().split(" ");
            
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(aInput[i]);
            }
            
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(bInput[i]);
            }
            
            Set<Integer> uniqueC = new HashSet<>();
            
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++){
                uniqueC.add(a[i] + b[j]);
                }
            }
            System.out.println(uniqueC.size() >= 3 ? "YES" : "NO");
        }
    }
}
