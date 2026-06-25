class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int ans=0;
        int left=0;
        long product=1;
        if(k<=1) return 0;

        for(int right=0;right<n;right++){
            product*=nums[right];
            while(product>=k){
                product/=nums[left];
                left++;
            }
            ans+=(right-left+1);
        }
        return ans;
    }
}