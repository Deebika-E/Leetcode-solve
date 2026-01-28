// Last updated: 1/28/2026, 7:17:47 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4        if(nums.length<=2){
5            return nums.length;
6        }
7
8        int i=2;
9        for(int j=2;j<nums.length;j++){
10            if(nums[j]!=nums[i-2]){
11                nums[i]=nums[j];
12                i++;
13            }
14        }
15        return i;
16    }
17}