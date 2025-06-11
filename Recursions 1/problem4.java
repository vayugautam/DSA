// print sum of numbers from 1 to n.
public class problem4 {
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int sum = n + sum(n-1);
        return  sum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
    
}
