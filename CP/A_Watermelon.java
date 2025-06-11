import java.util.Scanner;

public class A_Watermelon {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        n = n/2;
        //int[] reciever = new int[n];
        if(n%2 == 1) System.out.println("NO");
        else System.out.println("YES");

        
    }
}