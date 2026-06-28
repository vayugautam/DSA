class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int minsize=Integer.MAX_VALUE;
        int low=0;
        for(int high=0;high<nums.length;high++){
            sum+=nums[high];
            while(sum>=target){
                minsize=Math.min(minsize,high-low+1);
                sum-=nums[low];
                low++;
            }
        }
        return minsize == Integer.MAX_VALUE ? 0 : minsize;
    }
}