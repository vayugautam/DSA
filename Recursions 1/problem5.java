// print Nth fibonacci number. 
public class problem5 {
    public static int fibonacci(int n) {
        if (n==0||n==1) {
            return n;
        }
        int fib=fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(11));
        System.out.println(fibonacci(12));

    }
}
