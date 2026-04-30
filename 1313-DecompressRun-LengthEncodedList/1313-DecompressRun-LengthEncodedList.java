// Last updated: 4/30/2026, 6:45:32 PM
1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        ArrayList<Integer> list=new ArrayList<>();
4   
5     for(int i=1;i<nums.length;i++){
6           for(int j=0;j<nums[i-1];j++){
7            list.add(nums[i]);
8           }
9        i++;
10     }
11     int[] arr=new int[list.size()];
12     for(int i=0;i<arr.length;i++){
13        arr[i]=list.get(i);
14     }
15     return arr;
16    }
17}