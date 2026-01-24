// Last updated: 1/24/2026, 3:26:06 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int maxsum=0;
        while(left<right){
            maxsum=Math.max(maxsum,nums[left]+nums[right]);
            left++;
            right--;
        }
        return maxsum;
    }
}