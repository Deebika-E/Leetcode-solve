// Last updated: 1/24/2026, 3:25:30 PM
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);

            // Power of 2 → impossible
            if ((x & (x - 1)) == 0) {
                ans[i] = -1;
                continue;
            }

            // Count trailing 1s
            int k = 0;
            while ((x & 1) == 1) {
                k++;
                x >>= 1;
            }

            ans[i] = nums.get(i) - (1 << (k - 1));
        }

        return ans;
    }
}
