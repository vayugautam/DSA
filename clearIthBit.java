public class clearIthBit {
    public static int clearIthbit(int n,int i) {
        int bitMask = (~(1<<i));
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthbit(10, 1));
    }
}
