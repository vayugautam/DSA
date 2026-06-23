import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int resSum = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                int d = Math.abs(target - total);

                if (d < diff) {
                    diff = d;
                    resSum = total;
                }

                if (total == target) {
                    return resSum;
                } else if (total < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return resSum;
    }
}