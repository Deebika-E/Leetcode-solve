// Last updated: 6/11/2026, 7:39:49 PM
1class Solution {
2    public List<Integer> stableMountains(int[] height, int threshold) {
3        List<Integer> res=new ArrayList<>();
4
5        for(int i=1;i<height.length;i++){
6            if(height[i-1]>threshold){
7                res.add(i);
8            }
9        }
10    return res;
11    }
12}