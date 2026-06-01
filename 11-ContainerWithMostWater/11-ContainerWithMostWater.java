// Last updated: 6/1/2026, 8:30:23 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left=0;
4        int right=height.length-1;
5        int maxarea=0;
6        while(left<right){
7            maxarea=Math.max(maxarea,(right-left)*Math.min(height[left],height[right]));
8            if(height[left]<height[right]){
9                left++;
10            }else{
11                right--;
12            }
13       }
14       return maxarea;
15    }
16}