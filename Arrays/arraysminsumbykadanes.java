public class arraysminsumbykadanes {
    public static void kadanes(int numbers[]) {
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;

        for(int i = 0;i<numbers.length;i++){
            currentSum= currentSum + numbers[i];
            if(currentSum>0){
                currentSum=0;
            }
            minSum = Math.min(minSum, currentSum);
        }
        System.out.println("our min subarray sum is : "+minSum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,-4,-1,-2,-1,-5,-3};
        kadanes(numbers);
    }
}
