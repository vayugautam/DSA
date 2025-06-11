public class arrays_maxsumsubarray {

    public static void maxsubarrayssum(int numbers[]) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i = 0;i<numbers.length;i++) {
            int start = i;
            for(int j = i ;j<numbers.length;j++){
                int end = j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum+=numbers[k];
                    System.out.println(" the sum of this subarray is : "+currentSum);
                }
                if (maxSum<currentSum) {
                    maxSum=currentSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the maximum sum above all subarrays is : "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxsubarrayssum(numbers);
    }
}
    

