import java.util.*;

class Solution {
    class Fenwick {
        int[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 2];
        }

        void update(int idx, int val) {
            while (idx <= n) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        int query(int idx) {
            int sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }

    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        boolean found = false;
        int[] pref = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) found = true;
            pref[i + 1] = pref[i] + (nums[i] == target ? 1 : -1);
        }

        if (!found) return 0L;

        // Coordinate compression
        int[] vals = pref.clone();
        Arrays.sort(vals);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 1;
        for (int x : vals) {
            if (!map.containsKey(x)) {
                map.put(x, idx++);
            }
        }

        Fenwick bit = new Fenwick(idx);

        long ans = 0;

        for (int x : pref) {
            int compressed = map.get(x);

            // Count previous prefix sums strictly smaller than current
            ans += bit.query(compressed - 1);

            // Insert current prefix sum
            bit.update(compressed, 1);
        }

        return ans;
    }
}