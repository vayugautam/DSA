public class checkpoweroftwoornot {

    public static boolean checkpoweroftwo(int n) {
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(checkpoweroftwo(3));
    }
    
}
