public class binomialcoefficient {
    public static int factorial(int n) {
        int f = 1;
        
        for(int i = 1;i<=n;i++) {
            f=f*i;
        }
        return f;
    }
    public static int bincoeff(int n,int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nminusr=factorial(n-r);
        int bincoeff = fact_n/(fact_r*fact_nminusr);
        return bincoeff;

        
    }
    public static void main(String[] args) {
        System.out.println(bincoeff(5, 2));
    }
    
}
