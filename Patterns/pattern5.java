public class pattern5 {
    public static void hollow_rectangle(int totRows,int totCols) {
        //outer loop(rows)
        for(int i =1;i<=totRows;i++){
            //inner columns
            for(int j = 1;j<=totCols;j++){
                if (i==1||j==1||i==totRows||j==totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(2, 2);
    }
    
}
