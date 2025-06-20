public class clearbits {
    public static int clearlastIbits(int n,int i ) {
        int bitMask = (~0)<<i;
        return n&bitMask;
    }

    public static int clearbitsinrange(int n,int i,int j) {
        int a=(~0<<(j+1));
        int b=(1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearbitsinrange(48, 3,5));
    }
}
