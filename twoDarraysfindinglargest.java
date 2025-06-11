import java.util.Scanner;

public class twoDarraysfindinglargest {
    public static void findlargestelement(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
            for(int i = 0;i<matrix.length;i++){
                for(int j = 0; j<matrix[0].length;j++) {
                    largest = Math.max(largest, matrix[i][j]);
                }
            }
            System.out.println("largest no. is : " + largest);
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            for(int j = 0; j<m;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0;i<n;i++){
            for(int j = 0; j<m;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        findlargestelement(matrix);
    }
}