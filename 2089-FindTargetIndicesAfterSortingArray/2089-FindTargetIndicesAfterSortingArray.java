// Last updated: 10/19/2026, 11:09:07 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        List<Integer> li=new ArrayList<>();
4        int count=0;
5        int start=0;
6        for(int num:nums){
7            if(num==target){
8                count++;
9            }
10            if(num<target){
11                start++;
12            }
13        }
14        while(count--!=0){
15            li.add(start++);
16        }
17        return li;
18    }
19}