public class problem11tilingproblem {
    public static int tilingProblem(int n) { // 2 x n (floor size)
        //base case
        if (n==0||n==1) {
            return  1;
        }
        // kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);
        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}