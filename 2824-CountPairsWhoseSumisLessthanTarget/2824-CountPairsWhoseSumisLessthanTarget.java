// Last updated: 5/13/2026, 7:23:09 PM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3      Collections.sort(nums);
4      int count=0;
5      int left=0;
6      int right=nums.size()-1;
7      while(left<right){
8           if(nums.get(left)+nums.get(right)<target){
9                count+=right-left;
10                left++;
11           }else{
12                right--;
13           }
14      }
15     return count;
16    }
17}