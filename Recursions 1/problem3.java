// print fact of a number n.
public class problem3 {
    
    public static int fact(int n) {
        if (n==0) {
            return 1;
        }
        int fnminus1 = fact(n-1);
        int fn  = n*fnminus1;
        return fn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
    }
}
