// Last updated: 5/30/2026, 8:56:00 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        List<Integer> res =new ArrayList<>();
4        for(int i=0;i<nums.length;i++){
5            int index=Math.abs(nums[i])-1;
6            if(nums[index]<0){
7                res.add(Math.abs(nums[i]));
8            }else{
9                nums[index]=-nums[index];
10            }
11        }
12        return res;
13    }
14}