// Last updated: 6/14/2026, 7:02:41 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3         List<String> str=new ArrayList<>();
4         int i=0;
5         while(i<nums.length){
6            int start=nums[i];
7            while(i+1<nums.length && nums[i+1]==nums[i]+1){
8                 i++;
9            }
10            int end=nums[i];
11            if(start==end){
12                str.add(String.valueOf(start));
13            }else{
14                str.add(start+ "->" + end);
15            }
16            i++;
17         }
18         return str;
19    }
20}