public class updateIthbit {
    public static int setIthbit(int n,int i) {
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int clearIthbit(int n,int i) {
        int bitMask = (~(1<<i));
        return n & bitMask;
    }
    public static int updateIthBit(int n,int i,int newbit) {
        /*if (newbit==0) {
            return clearIthbit(n, i);
        } else {
            return setIthbit(n, i);
        }*/

        n = clearIthbit(n, i);
        int bitMask = newbit<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2,1));
    }
}
