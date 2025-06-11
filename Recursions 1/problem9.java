public class problem9 {

    public static int power(int x,int n) {
        if (n==0) {
            return 1;
        }
        int xm1 = power(x, n-1);
        int xn = x*xm1;
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
}
