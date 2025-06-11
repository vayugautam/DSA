import java.util.Scanner;

public class A_Presents {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] reciever = new int[n];

        for(int i=0;i<n;i++){
            int givenTo=sc.nextInt();
            reciever[givenTo-1]=i+1;
        }
        for(int i=0;i<n;i++){
            System.out.print(reciever[i]+" ");
        }
    }
}