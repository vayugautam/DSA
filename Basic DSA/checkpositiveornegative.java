import java.util.Scanner;

public class checkpositiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("n is positive");
        }
        else{
            System.out.println("n is negative");
        }
        sc.close();

    }
    
}
