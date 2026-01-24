// Last updated: 1/24/2026, 3:26:56 PM
class Solution {
    public int missingNumber(int[] nums) {

        int val=0;

        for(int i=0;i<=nums.length;i++){
            val^=i;
        }

        for(int a:nums){
            val^=a;
        }
       return val; 
    }
}