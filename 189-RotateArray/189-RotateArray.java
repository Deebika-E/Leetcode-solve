// Last updated: 4/3/2026, 10:50:06 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        k %= nums.length;
4
5        reverse(nums, 0, nums.length - 1);
6        reverse(nums, 0, k - 1);
7        reverse(nums, k, nums.length - 1);
8    }
9
10    private void reverse(int[] nums, int left, int right) {
11        while (left < right) {
12            int temp = nums[left];
13            nums[left] = nums[right];
14            nums[right] = temp;
15            left++;
16            right--;
17        }
18    }    
19}