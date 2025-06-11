public class problem9optimized {
    public static int optimizedpower(int a,int n) {
        if (n == 0) {
            return 1; 
        }
        int halfpower = optimizedpower(a, n/2);
        int halfpowersq = halfpower*halfpower;
        if (n % 2 != 0) {
            halfpowersq = a * halfpowersq;
        }
        if(n<0){//if value of n is negative learned from leetcode :D
            return 1/optimizedpower(a,-n);
        }
        return  halfpowersq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedpower(2,5));
    }
}
