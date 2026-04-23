// Last updated: 4/23/2026, 6:48:30 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3      int left=0;
4      int right=nums.length -1;
5
6      while(left<right){
7        int mid=left+(right-left)/2;
8        if((mid % 2 == 0 && nums[mid + 1] == nums[mid]) || 
9                (mid % 2 == 1 && nums[mid - 1] == nums[mid])){
10             left=mid+1;
11        }else{
12            right=mid;
13        }
14
15      }  
16      return nums[left];
17    }
18}