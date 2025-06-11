public class Question2 {
    public static int majorityElementRec(int[] nums,int si,int ei) {
        //base case
        if (si==ei) {
            return nums[si];
        }
        //recurse on left and right halves of this slice.
        int mid = si+(ei-si)/2;
        int left = majorityElementRec(nums, si, mid);
        int right = majorityElementRec(nums, mid+1, ei);
        //if the two halves have the same element as majority element,return the element.
        if (left==right) {
            return left;
        }
        //otherwise,count each element and return the majorityelement.
        int leftCount = countInRange(nums, left, si, ei);
        int rightCount = countInRange(nums, right, si, ei);

        return leftCount>rightCount ? left:right;
    }
    private static int countInRange(int[] nums,int num,int si,int ei) {
        int count = 0;
        for(int i = si;i<=ei;i++){
            if (nums[i]==num) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,2,2};
        System.out.println(majorityElementRec(nums, 0, nums.length-1));
    }
}
