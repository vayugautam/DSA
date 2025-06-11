public class setithbit {
    public static int setIthbit(int n,int i) {
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthbit(10,4));
    }
}
