import java.util.Scanner;

public class A_Draw_a_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            int u = sc.nextInt();
            if (l == r && r==d && d==u && u==l) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        } 
    }
}