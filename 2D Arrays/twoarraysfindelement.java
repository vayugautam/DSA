import java.util.Scanner;

public class twoarraysfindelement {
        public static boolean find(int matrix[][],int key) {
            for(int i = 0;i<matrix.length;i++){
                for(int j = 0; j<matrix[0].length;j++) {
                    if (key == matrix[i][j]) {
                        System.out.println("found at cell : "+"("+i+","+j+")");
                        return true;
                    }
                    
                }
            }
            System.out.println("key not found");
            return false;
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
        find(matrix, 6);
    }
    
    
}
