// Last updated: 3/28/2026, 2:43:37 PM
1class Solution {
2    public int[] getConcatenation(int[] nums ) {
3        int n=nums.length;
4        int result[] = new int[n*2];
5        int sum=0;int index = 0;
6        for(int i = 0; i < result.length; i++){
7            if(i < nums.length){
8                result[i] = nums[i];
9            }else{
10                result[i] = nums[index];
11                index++;
12            }
13        
14        }
15        return result;
16    }
17}