import java.util.Scanner;

public class circleofarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius =sc.nextInt();
        float area = radius*radius*3.14f;
        System.out.println(area);
        sc.close();

    }
    
}
