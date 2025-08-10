import java.util.Arrays;

public class Minabsdiffpairs {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int B[] = {10, 2, 3, 4, 5};
        Arrays.sort(A);
        Arrays.sort(B);
        int mindiff=0;
        for(int i = 0;i<A.length;i++){
            mindiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println(mindiff);
    }
}
