public class optimizedprimebyfunction {
    public static boolean isPrime(int num) {
        if(num == 2) {
            return true;
        }
        boolean isPrime=true;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num % i == 0) {
                isPrime=false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
    
}
