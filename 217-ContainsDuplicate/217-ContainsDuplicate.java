// Last updated: 1/24/2026, 3:27:01 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n=nums.length;

        Arrays.sort(nums);

        for(int i=1;i<n;i++){
                if(nums[i]==nums[i-1])
                   return true;
                  
            
        }
      return false;  
    }
}