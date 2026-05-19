// Last updated: 5/19/2026, 6:29:05 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3       
4        Set<Integer> set1=new HashSet<>();
5        for(int num:nums1){
6            set1.add(num);
7        }
8
9        for(int num1:nums2){
10            if(set1.contains(num1)){
11                return num1;
12            }
13        }
14        return -1;
15    }
16}